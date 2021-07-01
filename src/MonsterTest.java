import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonsterTest {

    @Test
    void runs() {
        Monster monster = new Monster();
        assertTrue(monster.runs());
    }

    @Test
    void drive() {
        Monster monster = new Monster();
        assertNotNull(monster.drive());
    }

    @Test
    void wash() {
        Monster monster = new Monster();
        assertTrue(monster.wash());
    }
}