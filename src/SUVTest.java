import static org.junit.jupiter.api.Assertions.*;

class SUVTest {
    @org.junit.jupiter.api.Test
    void SUV(){
        SUV suv = new SUV();
        assertEquals("SUV", suv.getPlate().substring(0,3));
    }

}