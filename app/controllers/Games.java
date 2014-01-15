package controllers;

import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;

import play.Logger;
import play.Routes;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.*;

import models.*;

/**
 * Manage game related operations
 */
@Security.Authenticated(Secured.class)
public class Games extends Controller {
    
    /**
     * Result to redirect to application home
     */
    public static Result GO_HOME = redirect(
        routes.Games.list()
    );
    
    /**
     * Handle default path requests, redirect to games list
     */
    public static Result index() {
        return GO_HOME;
    }

    /**
     * Display the lists of games
     */
    public static Result list() {
        return ok(
            list.render(
                null,
                Game.list(false),
                Game.list(true),
                User.find.byId(request().username())
            )
        );
    }
    
    /**
     * Display the 'edit form' of a existing Game
     *
     * @param id Id of the game to edit
     */
    public static Result edit(Long id) {
        Form<Game> gameForm = form(Game.class).fill(
            Game.find.byId(id)
        );
        return ok(
            editForm.render(id, gameForm, User.find.byId(request().username()))
        );
    }
    
    /**
     * Handle the 'edit form' submission 
     *
     * @param id Id of the game to edit
     */
    public static Result update(Long id) {
        DynamicForm requestData = form().bindFromRequest();
        Game game = Game.find.ref(id);
        game.owned = Boolean.parseBoolean(requestData.get("owned"));

        game.update();
        flash("success", "Game " + game.title + " has been updated");
        return GO_HOME;
    }
    
    /**
     * Display the 'new game form'
     */
    public static Result create() {
        Form<Game> gameForm = form(Game.class);
        return ok(
            createForm.render(gameForm, User.find.byId(request().username()))
        );
    }
    
    /**
     * Handle the 'new game form' submission 
     */
    public static Result save() {
        Form<Game> gameForm = form(Game.class).bindFromRequest();
        if(gameForm.hasErrors()) {
            return badRequest(createForm.render(gameForm, User.find.byId(request().username())));
        }
        
        // Check if user has already voted or created a game today
        User user = User.find.byId(request().username());
        
        List<Game> gamesCreated = Game.findCreatedTodayByEmail(user.email);
                                    
        List<Vote> votesCast = Vote.findCreatedTodayByEmail(user.email);

        if(gamesCreated.size() > 0 || votesCast.size() > 0) {
            gameForm.reject("You have already created a game or cast a vote today");
            return ok(
                createForm.render(gameForm, user)
            );
        }
        
        // Check if today is a work day
        if(!isWorkingDay()) {
            return ok(
                list.render(
                    "Games cannot be added on Saturday or Sunday",
                    Game.list(false),
                    Game.list(true),
                    User.find.byId(request().username())
                )
            );
        }
        
        // Save new game and add initial vote
        Game game = gameForm.get();
        game.votes.add(new Vote(user));
        game.save();
        flash("success", "Game " + gameForm.get().title + " has been created");
        return GO_HOME;
    }
    
    /**
     * Handle submission of votes
     *
     * @param id Id of the game update
     */
    public static Result vote(Long id) {
        // Check if user has already voted or created a game today
        User user = User.find.byId(request().username());
        
        List<Game> gamesCreated = Game.findCreatedTodayByEmail(user.email);
                                    
        List<Vote> votesCast = Vote.findCreatedTodayByEmail(user.email);

        if(gamesCreated.size() > 0 || votesCast.size() > 0) {
            return ok(
                list.render(
                    "You have already created a game or cast a vote today",
                    Game.list(false),
                    Game.list(true),
                    User.find.byId(request().username())
                )
            );
        }
        
        // Check if today is a work day
        if(!isWorkingDay()) {
            return ok(
                list.render(
                    "Votes cannot be cast on Saturday or Sunday",
                    Game.list(false),
                    Game.list(true),
                    User.find.byId(request().username())
                )
            );
        }
        
        // Add vote to and update existing game
        Game game = Game.find.ref(id);
        game.votes.add(new Vote(user));
        game.update();
        flash("success", "Game " + game.title + " has been voted for");
        return GO_HOME;
    }
    
    /**
     * Determine if today is a work day
     */
    private static Boolean isWorkingDay() {
        DateTime dt = new DateTime();
        Integer dayOfWeek = dt.getDayOfWeek();
        if(dayOfWeek == DateTimeConstants.SATURDAY || dayOfWeek == DateTimeConstants.SUNDAY) {
            return false;
        }
        return true;
    }
}
            
