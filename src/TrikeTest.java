import static org.junit.jupiter.api.Assertions.*;

class TrikeTest {
    @org.junit.jupiter.api.Test
    void Trike(){
        Trike trike = new Trike();
        assertEquals("TRI", trike.getPlate().substring(0,3));
    }

}