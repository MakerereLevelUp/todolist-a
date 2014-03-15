package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import play.*;
import play.mvc.*;


public class Application extends Controller {

    public static Result index() {
        return ok(index.render("dracula"));
    }

    public static Result todoList() {
        return ok(models.Todo.getTodos().toString());


    }
}
