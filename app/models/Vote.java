package models;

import org.joda.time.DateTime;

import java.sql.Timestamp;
import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.validation.*;

import com.avaje.ebean.annotation.CreatedTimestamp;

/**
 * Vote entity managed by Ebean
 */
@Entity 
public class Vote extends Model {

      private static final long serialVersionUID = 1L;

      @Id
      public Long id;
      
      @ManyToOne
      public User createdBy;
      
      @CreatedTimestamp
      public Timestamp created;
      
      public Vote(User createdBy) {
          this.createdBy = createdBy;
      }
      
      /**
       * Generic query helper for entity Vote with id Long
       */
      public static Model.Finder<Long,Vote> find = new Model.Finder<Long,Vote>(Long.class, Vote.class);
      
      /**
      * Find votes cast by user in last twenty-four hours
      * @param email E-mail address of user
      */
      public static List<Vote> findCreatedTodayByEmail(String email) {
        DateTime midnight = new DateTime().toDateMidnight().toDateTime();
        
        return find.where()
                .eq("createdBy.email", email)
                .between("created", midnight, midnight.plusDays(1))
                .findList();
      }
}



