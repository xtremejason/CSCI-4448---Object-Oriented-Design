public class Trike extends Motorcycle{
    public Trike(){
        generatePlate("TRI");
    }

    public void runs(){
        System.out.println(plate + " " + "Pedals");
    }
}
