import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//test to see if decorator allows wrapping of Task object.
class TaskDecoratorTest {

    @Test
    void getDescription() {
        Vehicles veh = new Vehicles();
        Task task = new Wash(veh);
        task = new CeramicCoat(task);
        task = new CeramicCoat(task);
        task = new GlitterWax(task);
        System.out.println(task.getDescription());
        assertNotNull(task, task.getDescription());
    }
}