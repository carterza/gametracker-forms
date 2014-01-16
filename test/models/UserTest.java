package models;

import org.junit.*;

import java.util.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

import com.avaje.ebean.*;

public class UserTest {
    
    @Test
    public void findAll() {
        running(fakeApplication(), new Runnable() {
            public void run() {
                List<User> users = User.findAll();
                assertThat(users.size()).isEqualTo(2);
            }
        });
    }
    
    @Test
    public void findByEmail() {
        running(fakeApplication(), new Runnable() {
            public void run() {
                User bob = User.findByEmail("bob@example.com");
                assertThat(bob).isNotEqualTo(null);
                assertThat(bob.name).isEqualTo("Bob Bobberson");
                assertThat(bob.email).isEqualTo("bob@example.com");
            }
        });
    }
    
    @Test
    public void authenticate() {
        running(fakeApplication(), new Runnable() {
            public void run() {
                User bob = User.findByEmail("bob@example.com");
                assertThat(User.authenticate("bob@example.com", "secret")).isEqualTo(bob);
            }
        });
    }

}
