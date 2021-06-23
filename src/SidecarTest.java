import static org.junit.jupiter.api.Assertions.*;

class SidecarTest {
    @org.junit.jupiter.api.Test
    void Sidecar(){
        Sidecar sc = new Sidecar();
        assertEquals("SID", sc.getPlate().substring(0,3));
    }

}