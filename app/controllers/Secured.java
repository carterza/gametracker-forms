package controllers;

import play.mvc.*;
import play.mvc.Http.*;

import models.*;

public class Secured extends Security.Authenticator {
    
    /**
     * Get username from session
     *
     * @param ctx Application context
     */
    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("email");
    }
    
    /**
     * Redirect user to login page
     *
     * @param ctx Application context
     */
    @Override
    public Result onUnauthorized(Context ctx) {
        return redirect(routes.Application.login());
    }
    
}