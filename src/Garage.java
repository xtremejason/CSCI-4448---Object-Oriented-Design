import java.util.Random;

public class Garage {
    private int randomNum;

    Garage(){
    }

    //method to create objects of random vehicles with approx. equal probability.
    public Vehicles createVehicleObject(){
        Random rand = new Random();
        randomNum = rand.nextInt(11);

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
            case 3:
                Convertible convertible = new Convertible();
                return convertible;
            case 4:
                Hatchback hatchback = new Hatchback();
                return hatchback;
            case 5:
                SUV suv = new SUV();
                return suv;
            case 6:
                Wagon wagon = new Wagon();
                return wagon;
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
