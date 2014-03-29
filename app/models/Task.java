package models;

import java.util.ArrayList;
import java.util.List;


public class Task{
   String taskName;
   String description;

    public Task(String taskName,String description){
        this.taskName = taskName;
        this.description = description;
    }

    public String myTask()
    {
        return (taskName+" "+description);
    }
    public  String getTaskName()
    {
        return taskName;
    }
    public String getDescription()
    {
        return description;
    }

}
