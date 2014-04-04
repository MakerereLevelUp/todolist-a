package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Task extends Model{
    public Long id;

   @Constraints.Required
   public String taskName;

   @Constraints.Required
   public String description;

   public static Finder<Long,Task> find = new Finder(Long.class, Task.class);

   public Task(String name, String description) {
       //this.id = id;
       this.taskName = name;
       this.description = description;
   }

   public  String getTaskName()
    {
        return taskName;
    }
   public String getDescription()
    {
        return description;
    }

   public static List<Task> all() {
        return find.all();
   }
   public  static void createTask(Task task)
   {
        task.save();
   }
   public static void deleteTask(Long id)
   {
        find.ref(id).delete();
   }

}
