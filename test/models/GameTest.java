package models;

import org.junit.*;

import java.util.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

import com.avaje.ebean.*;

public class GameTest {
    
    @Test
    public void list() {
        running(fakeApplication(), new Runnable() {
            public void run() {
                List<Game> ownedGames = Game.list(true);
                assertThat(ownedGames.size()).isEqualTo(3);
                assertThat(ownedGames.get(0).title).isEqualTo("Battlefield 4");
                
                List<Game> wantedGames = Game.list(false);
                assertThat(wantedGames.size()).isEqualTo(3);
                assertThat(wantedGames.get(0).votes.size()).isEqualTo(1);
                assertThat(wantedGames.get(0).title).isEqualTo("Minecraft");
            }
        });
    }
    
    @Test
    public void findCreatedTodayByEmail() {
        running(fakeApplication(), new Runnable() {
            public void run() {
                List<Game> createdTodayByJeff = Game.findCreatedTodayByEmail("jeff@example.com");
                assertThat(createdTodayByJeff.size()).isEqualTo(6);
                
                List<Game> createdTodayByBob = Game.findCreatedTodayByEmail("bob@example.com");
                assertThat(createdTodayByBob.size()).isEqualTo(0);
            }
        });
    }
    
    @Test
    public void compare() {
        running(fakeApplication(), new Runnable() {
            public void run() {
                Game g1 = Game.find.where()
                            .eq("title", "Minecraft")
                            .findUnique();
                            
                Game g2 = Game.find.where()
                            .eq("title", "Thief")
                            .findUnique();
                            
                Game.VoteCountComparator comparator = new Game.VoteCountComparator();
                assertThat(comparator.compare(g1,g2)).isEqualTo(1);
            }
        });
    }
    
    @Test
    public void validate() {
        running(fakeApplication(), new Runnable() {
            public void run() {
                Game game = new Game();
                game.title = "Minecraft";
                String validationResult =  game.validate();
                assertThat(validationResult).isEqualTo("A game with that title already exists");
            }
        });
    }

}
