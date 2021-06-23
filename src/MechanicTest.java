import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MechanicTest {

    @Test
    void addAnnouncer() {
        GarageAnnouncer ga = new GarageAnnouncer(1);
        Mechanic mech = new Mechanic(1);
        mech.addAnnouncer(ga);
        assertEquals(mech.ann, ga);

    }

    @Test
    void setName() {
        Mechanic mech = new Mechanic(1);
        mech.setName("Clifford");
        assertEquals("Clifford", mech.getName());
    }

    @Test
    void wash() {
    }

    @Test
    void tuneUp() {
    }

    @Test
    void testDrive() {
    }

    @Test
    void lockUp() {
    }
}