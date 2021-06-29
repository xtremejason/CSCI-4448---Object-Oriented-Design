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
    private boolean lockStatus = true;
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

    public boolean lock(){
        lockStatus = true;
        return true;
    }

    public boolean unlock(){
        lockStatus = false;
        return true;
    }

    //Added 30% chance occurrence of vehicle sparkling instead of shine from a wash
    public boolean wash(){
        shineStatus = true;
        if(Math.random() < .7) {
            System.out.println(plate + " Shines in the sun.");
        } else {
            System.out.println(plate + " Sparkles so bright!!");
        }
        return true;
    }

    public boolean tune(){
        tunedStatus = true;
        return true;
    }

    public boolean runs(){
        System.out.println(plate + " " + runStatus);
        return true;
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

    public boolean getLockStatus(){
        return lockStatus;
    }

    public boolean getShineStatus(){
        return shineStatus;
    }

    public boolean getTunedStatus(){
        return tunedStatus;
    }

    public String getRunStatus(){
        return runStatus;
    }

    public void getFuelType(){
        fuelType.printFuel();
    }
}
