import models.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TaskTest {

    @Test
    public void testTask()
    {
        Task task = new Task("Dancing","Go parting");
        assertThat(task.getTaskName(),is("Dancing"));
    }
}
