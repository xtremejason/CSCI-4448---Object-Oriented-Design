/* SuperClass for Motorcycle, Car, Truck
 */

public class Vehicles {
    String name = "Vehicle";
    String plateNumber = "12345";
    private boolean lockStatus;
    private String shineStatus = "dirty";


    public void lock(){
        lockStatus = true;
        System.out.println(name + " " + plateNumber + " " + "locked");
    }

    public void unlock(){
        lockStatus = false;
        System.out.println(name + " " + plateNumber + " " + "unlocked");
        }
    }

    public void shine() {
        shineStatus = "clean";
        System.out.println(name + " " + plateNumber + " " + "Shined");
    }
/*
    public void tune() {

    }

    public void drive() {
    }
*/

}
