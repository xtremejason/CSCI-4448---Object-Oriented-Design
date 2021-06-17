public class Bike extends Motorcycle{

    public Bike(){
        generatePlate("BIK");
    }

    //override method runs
    public void runs(){
        System.out.println(plate + " " + "Pedals");
    }
}
