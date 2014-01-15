import play.*;
import play.libs.*;

import java.util.*;

import com.avaje.ebean.*;

import models.*;

public class Global extends GlobalSettings {
    
    /**
     * Called by play framework when app is started in dev
     *
     * @param app Application context
     */
    public void onStart(Application app) {
        InitialData.insert(app);
    }
    
    /**
     * Bootstraps test data
     *
     * @param app Application context
     */
    static class InitialData {
        
        public static void insert(Application app) {
            if(Ebean.find(Game.class).findRowCount() == 0) {
                
                @SuppressWarnings("unchecked")
                Map<String,List<Object>> all = (Map<String,List<Object>>)Yaml.load("initial-data.yml");

                // Insert games
                Ebean.save(all.get("games"));
                
                // Insert users
                Ebean.save(all.get("users"));
            }
        }
        
    }
    
}