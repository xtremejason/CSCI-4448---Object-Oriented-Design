import static org.junit.jupiter.api.Assertions.*;

class TruckTest {
    @org.junit.jupiter.api.Test
    void Truck(){
        Truck truck = new Truck();
        assertEquals("TRU", truck.getPlate().substring(0,3));
    }

}