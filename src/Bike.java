public class Bike extends Motorcycle{

    public Bike(){
        generatePlate("BIK");
    }

    public void runs(){
        System.out.println(name + " " + plate + " " + "Pedals");
    }
}
