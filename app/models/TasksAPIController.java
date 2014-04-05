package models;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

public class TasksAPIController extends Controller {
    public static Result allTasks()
    {
        List<Task> tasks = Task.all();
        JsonNode jsonNode = Json.toJson(tasks);
        return ok(jsonNode);
    }

}
