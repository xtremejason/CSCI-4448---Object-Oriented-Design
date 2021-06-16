public class Monster extends Truck{
    public Monster(){
        generatePlate("MON");
    }

    public void runs(){
        System.out.println(name + " " + plate + " " + "Vrooooms");
    }
}
