import models.Todo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by bonita on 3/15/14.
 */
public class TodoTest {
 @Test
public void shouldGetTodo(){
     List todos = new ArrayList();
     todos.add("Wake Up");
     todos.add("Stretch");
     todos.add("Yawn");

     assertThat(Todo.getTodos(), is(todos));
 }


}

