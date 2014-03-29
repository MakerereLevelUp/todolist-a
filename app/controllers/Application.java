package controllers;

import models.TaskManager;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("dracula"));
    }

    public static Result todoList() {
        return ok(models.Todo.getTodos().toString());

    }
    public static Result showTasks()
    {
        return ok(tasks.render(new TaskManager().displayTask()));
    }
}
