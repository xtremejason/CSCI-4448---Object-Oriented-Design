/* SuperClass for Motorcycle, Car, Truck
 */
import java.util.Random;

//Upmost Superclass for several vehicles
public class Vehicles {
    //Superclass Variables
    //Encapsulation is observed here with Private and protected variables.
    //Private is only accessible to immediate class
    //Protected is only accessible to self and extended classes.
    protected String plate;
    private boolean lockStatus;
    private boolean shineStatus;
    protected boolean tunedStatus;
    protected String runStatus;

    //Reference Variables for FuelType Interface
    FuelType fuelType;


    //Default Constructor
    public Vehicles() {
        plate = "0";
        runStatus = "runs";
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
    }

    public void unlock(){
        lockStatus = false;
    }

    //Added 30% chance occurrence of vehicle sparkling instead of shine from a wash
    public void shine(){
        shineStatus = true;
        if(Math.random() < .7) {
            System.out.println(plate + " Shines in the sun.");
        } else {
            System.out.println(plate + " Sparkles so bright!!");
        }
    }

    public void tune(){
        tunedStatus = true;
    }

    public void runs(){
        System.out.println(plate + " " + runStatus);
    }

    public boolean drive(){
        System.out.println(plate + " Drives");
        return true;
    }

    public void displayPlate(){
        System.out.println(plate);
    }

    public String getPlate(){
        return plate;
    }

    public void getFuelType(){
        fuelType.printFuel();
    }
}
