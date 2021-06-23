//Mechanic is the observable
public class Mechanic extends GarageEmployee{
    //Default Constructor
    GarageAnnouncer ann;

    Mechanic(int r){
        super(r);
    }

    public void addAnnouncer(GarageAnnouncer a){
        ann = a;
    }

    //Every time the mechanic does something, it sends an update to the observer, GarageAnnouncer
    public void unlock (Vehicles vehicle) {
        ann.update("UNLOCK");
        System.out.println(name + " has unlocked " + vehicle.getPlate());
        vehicle.unlock();
    }
    public void wash (Vehicles vehicle) {
        ann.update("WASH");
        System.out.println(name + " has washed " + vehicle.getPlate());
        vehicle.shine();
    }
    public void tuneUp (Vehicles vehicle) {
        ann.update("TUNE");
        System.out.println(name + " has tuned " + vehicle.getPlate());
        vehicle.tune();
    }
    public boolean testDrive (Vehicles vehicle) {
        ann.update("TEST");
        System.out.println(name + " has test driven " + vehicle.getPlate());
        return vehicle.drive();
    }
    public void lockUp (Vehicles vehicle) {
        ann.update("LOCK");
        System.out.println(name + " has locked up " + vehicle.getPlate());
        vehicle.lock();
    }
    public void finish(){
        ann.update("FINISH");
        System.out.println(name + " leaves the garage");
    }
}