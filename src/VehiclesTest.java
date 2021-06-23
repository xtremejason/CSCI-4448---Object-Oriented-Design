import static org.junit.jupiter.api.Assertions.*;

class VehiclesTest {

    @org.junit.jupiter.api.Test
    void getLockStatus() {
        Vehicles v1 = new Vehicles();
        v1.lock();
        assertTrue(v1.getLockStatus());
    }

    @org.junit.jupiter.api.Test
    void unlock() {
        Vehicles v1 = new Vehicles();
        v1.unlock();
        assertFalse(v1.getLockStatus());
    }

    @org.junit.jupiter.api.Test
    void shine() {
        Vehicles v1 = new Vehicles();
        v1.shine();
        assertTrue(v1.getShineStatus());
    }

    @org.junit.jupiter.api.Test
    void tune() {
        Vehicles v1 = new Vehicles();
        v1.tune();
        assertTrue(v1.getTunedStatus());
    }

    @org.junit.jupiter.api.Test
    void runs() {
    }

    @org.junit.jupiter.api.Test
    void drive() {
    }

    @org.junit.jupiter.api.Test
    void displayPlate() {
    }

    @org.junit.jupiter.api.Test
    void getPlate() {
    }
}