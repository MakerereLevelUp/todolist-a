package controllers;

import models.Task;
import models.TaskManager;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;
import views.html.helper.form;

import java.text.Normalizer;

public class Application extends Controller {
    static Form<Task> taskForm = Form.form(Task.class);

    public static Result index() {
        return redirect(routes.Application.tasks());
        //return ok(index.render("dracula"));
    }

    public static Result todoList() {
        return ok(models.Todo.getTodos().toString());

    }
    public static Result showTasks()
    {
        return ok(tasks.render(new TaskManager().displayTask()));
    }
    public static Result tasks() {
        return ok(
                dbtasks.render(Task.all(), taskForm)
        );
    }
    public static Result newTask(){
        Form<Task> filledForm = taskForm.bindFromRequest();
        if(filledForm.hasErrors()) {
            return badRequest(
                    dbtasks.render(Task.all(), filledForm)
            );
        } else {
            Task.createTask(filledForm.get());
            return redirect(routes.Application.tasks());
        }
    }
    public static Result deleteTask(Long id){
        Task.deleteTask(id);
        return redirect(routes.Application.tasks());
    }

}
