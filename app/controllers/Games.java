package controllers;

import play.Routes;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.*;

import models.*;

/**
 * Manage game related operations.
 */
@Security.Authenticated(Secured.class)
public class Games extends Controller {
    
    /**
     * This result directly redirects to the application home.
     */
    public static Result GO_HOME = redirect(
        routes.Games.list()
    );
    
    /**
     * Handle default path requests, redirect to games list.
     */
    public static Result index() {
        return GO_HOME;
    }

    /**
     * Display the lists of games.
     */
    public static Result list() {
        return ok(
            list.render(
                Game.list(false),
                Game.list(true),
                User.find.byId(request().username())
            )
        );
    }
    
    /**
     * Display the 'edit form' of a existing Game.
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
     * Display the 'new game form'.
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
        Game game = gameForm.get();
        game.votes.add(new Vote());
        game.save();
        flash("success", "Game " + gameForm.get().title + " has been created");
        return GO_HOME;
    }
    
    /**
     * Handle the 'vote form' submission 
     */
    public static Result vote(Long id) {
        Game game = Game.find.ref(id);
        game.votes.add(new Vote());
        game.update();
        return GO_HOME;
    }

}
            
