/* SuperClass for Motorcycle, Car, Truck
 */
import java.util.Random;

public class Vehicles {
    String name = "Vehicle";
    String plate;
    private boolean lockStatus;
    private String shineStatus;

    //Default Constructor
    public Vehicles() {
        name = "none";
        plate = "0";
    }

    //Random license plate generation with param
    public void generatePlate(String vehicleType){
        Random rand = new Random();
        int randomNumber = rand.nextInt(10000);
        String s = String.valueOf(randomNumber);
        plate = vehicleType + s;
    }

    public void lock(){
        lockStatus = true;
        System.out.println(name + " " + plate + " " + "locked");
    }

    public void unlock(){
        lockStatus = false;
        System.out.println(name + " " + plate + " " + "unlocked");
    }

    public void shine(){
        shineStatus = "clean";
        if(Math.random() < .7) {
            System.out.println(name + " " + plate + " " + "Shined");
        } else {
            System.out.println(name + " " + plate + " " + "Sparkles!");
        }
    }

    public void runs(){
        System.out.println(name + " " + plate + " " + "Runs");
    }
    public void drive(){
        System.out.println(name + " " + plate + " " + "Drives");
    }

    public void displayPlate(){
        System.out.println(plate);
    }
}
