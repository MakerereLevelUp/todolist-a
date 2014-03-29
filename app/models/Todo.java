package models;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bonita on 3/15/14.
 */
public class Todo {

    public static List getTodos(){
        List todos =  new ArrayList();
        todos.add("Wake Up");
        todos.add("Stretch");
        todos.add("Yawn");
        return todos;
    }

}

