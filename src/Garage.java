import java.util.Random;


public class Garage {
    private int randomNum;

    Garage(){
    }

    //method to create objects of random vehicles with approx. equal probability.
    public Vehicles createVehicleObject(){
        Random rand = new Random();
        randomNum = rand.nextInt(11);
        CarFactory cFactory = new CarFactory();

        switch(randomNum){
            case 0:
                Bike bike = new Bike();
                return bike;
            case 1:
                Trike trike = new Trike();
                return trike;
            case 2:
                Sidecar sidecar = new Sidecar();
                return sidecar;
            //Factory method to instantiate car subclasses
            case 3:
                return cFactory.getCar("CONVERTIBLE");
            case 4:
                return cFactory.getCar("HATCHBACK");
            case 5:
                return cFactory.getCar("SUV");
            case 6:
                return cFactory.getCar("WAGON");
            case 7:
                Pickup pickup = new Pickup();
                return pickup;
            case 8:
                Delivery delivery = new Delivery();
                return delivery;
            case 9:
                Monster monster = new Monster();
                return monster;
            case 10:
                Moped moped = new Moped();
                return moped;
            case 11:
                Electric electric = new Electric();
                return electric;
        }
        return null;
    }


}
