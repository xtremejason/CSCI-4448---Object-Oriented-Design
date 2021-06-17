    //Identity principle is observed because every Mechanic object is unique and has it's own
    //unique set of qualities as well as memory location.
    public class Mechanic extends GarageEmployee{

        //Default Constructor
        Mechanic(){
        }

        public void unlock (Vehicles vehicle) {
            vehicle.unlock();
            System.out.println(name + " has unlocked " + vehicle.getPlate());
        }

        public void wash (Vehicles vehicle) {
            vehicle.shine();
            System.out.println(name + " has washed " + vehicle.getPlate());
        }

        public void tuneUp (Vehicles vehicle) {
            vehicle.tune();
            System.out.println(name + " has tuned " + vehicle.getPlate());
        }

        public boolean testDrive (Vehicles vehicle) {
            vehicle.drive();
            System.out.println(name + " has test driven " + vehicle.getPlate());
            return true;
        }

        public void lockUp (Vehicles vehicle) {
            vehicle.lock();
            System.out.println(name + " has locked up " + vehicle.getPlate());
        }

    }


