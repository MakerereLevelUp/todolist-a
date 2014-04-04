import models.Task;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.running;

public class TestCreateNewTask {
    @Test
    public void shouldCreateANewTask()
    {
        running(fakeApplication(),new Runnable() {
            @Override
            public void run() {
                Task dancing = new Task("Dancing","Shake your body around");
                Task drinking = new Task("Drinking","Swallow through the throat");
                dancing.save();
                drinking.save();

                List<Task> tasks = Task.all();

                assertThat(tasks.size(),is(2));

                assertThat(tasks.get(0).getTaskName(),is("Dancing"));
                assertThat(tasks.get(1).getTaskName(),is("Drinking"));

            }
        });

    }

}
