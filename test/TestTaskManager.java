import models.Task;
import models.TaskManager;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestTaskManager {
    @Test
    public  void shouldTestForTaskItems()
    {
        TaskManager taskManager = new TaskManager();
        List<Task> taskList = new ArrayList<Task>();
        Task shopping = new Task("Shopping","Get my bag to the bark");
        Task typing = new Task("Typing","Get my hands on to the computer keyboard");
        Task driving = new Task("Driving","Guess what I will do");
        Task crying = new Task("Crying","I don't cry");
        taskList.add(shopping);
        taskList.add(typing);
        taskList.add(driving);
        taskList.add(crying);
        String listOfTasks = taskList.toString();
        assertThat(taskManager.displayTask(), is(listOfTasks));
    }
}
