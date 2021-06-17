/* SuperClass for Motorcycle, Car, Truck
 */
import java.util.Random;

public class Vehicles {
    String plate;
    private boolean lockStatus;
    private boolean shineStatus;
    protected boolean tunedStatus;
    protected String runStatus;

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
    public void drive(){
        System.out.println(plate + " Drives");
    }

    public void displayPlate(){
        System.out.println(plate);
    }
    public String getPlate(){
        return plate;
    }
}
