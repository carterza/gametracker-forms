package models;

import org.junit.*;

import java.util.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

import com.avaje.ebean.*;

public class VoteTest {
    
    @Test
    public void findCreatedTodayByEmail() {
        running(fakeApplication(), new Runnable() {
            public void run() {
                List<Vote> createdTodayByJeff = Vote.findCreatedTodayByEmail("jeff@example.com");
                assertThat(createdTodayByJeff.size()).isEqualTo(1);
            }
        });
    }

}
