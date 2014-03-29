package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by polly on 3/22/14.
 */
public class TaskManager {
    private static List<Task> todoList = new ArrayList<Task>();

    public TaskManager(){
        initializeTodoList();
    }

    private void initializeTodoList() {
        Task shopping = new Task("Shopping","Get my bag to the bark");
        Task typing = new Task("Typing","Get my hands on to the computer keyboard");
        Task driving = new Task("Driving","Guess what I will do");
        Task crying = new Task("Crying","I don't cry");
        todoList.add(shopping);
        todoList.add(typing);
        todoList.add(driving);
        todoList.add(crying);
    }

    public static List<Task> displayTask(){

        return todoList;
    }
}
