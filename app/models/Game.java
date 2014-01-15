package models;

import org.joda.time.DateTime;

import java.sql.Timestamp;
import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;
import com.avaje.ebean.annotation.CreatedTimestamp;

/**
 * Game entity managed by Ebean
 */
@Entity 
public class Game extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    public Long id;
    
    @Constraints.Required
    @Column(unique=true)
    public String title;
    
    @Constraints.Required
    public Boolean owned = false;
    
    @OneToMany(cascade=CascadeType.ALL)
    public List<Vote> votes;
    
    @ManyToOne
    public User createdBy;
    
    @CreatedTimestamp
    public Timestamp created;
    
    /**
     * Generic query helper for entity Game with id Long
     */
    public static Finder<Long,Game> find = new Finder<Long,Game>(Long.class, Game.class); 
    
    /**
     * Return a list of games
     * @param owned Filter applied on the owned field
     */
    public static List<Game> list(Boolean owned) {
        List<Game> games = find.fetch("votes")
                            .where()
                            .eq("owned", owned)
                            .orderBy("title asc")
                            .findList();
        
        if (!owned) {
            Collections.sort(games, Collections.reverseOrder(new Game.VoteCountComparator()));
        }
        
        return games;
    }
    
    /**
     * Find games created by user in last twenty-four hours
     * @param email E-mail address of user
     */
    public static List<Game> findCreatedTodayByEmail(String email) {
        DateTime midnight = new DateTime().toDateMidnight().toDateTime();
        
        return find.where()
                .eq("createdBy.email", email)
                .between("created", midnight, midnight.plusDays(1))
                .findList();
    }
    
    /**
     * Comparator used for sorting games by number of votes
     */
    static class VoteCountComparator implements Comparator<Game> {
      
        /**
        * Compare two games by their vote count
        * @param g1 Game to compare
        * @param g2 Game to compare against
        */
        public int compare(Game g1, Game g2) {
            int numVotes1 = g1.votes.size(),
                numVotes2 = g2.votes.size();
            
            return (numVotes1 == numVotes2) ? 0
                : (numVotes1 > numVotes2) ? 1
                : -1;
        }
    }
    
    /**
     * Uniqueness validation
     */
    public String validate() {
        List<Game> duplicateGames = Game.find.where()
                                    .eq("title", title)
                                    .findList();
                                    
        if (duplicateGames.size() > 0) {
            return "A game with that title already exists";
        }
        
        return null;
    }
    
}

