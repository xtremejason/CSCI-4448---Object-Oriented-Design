import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectricTest {

    @Test
    void Electric() {
        Electric electric = new Electric();
        assertEquals("ELE", electric.getPlate().substring(0, 3));
    }
}