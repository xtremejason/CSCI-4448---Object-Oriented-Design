import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;

//By Jason Nguyen, Varunjit Srinivas, Isaac Sim

public class main {

    public static void main(String[] args) {

        /*
        //Vehicles test = new Vehicles('t');
        Bike test = new Bike();
        test.lock();
        test.getPlate();

        //Testing for Mechanic -> GarageEmployee super/sub-class
        Mechanic test2 = new Mechanic();
        test2.GarageEmployee();
        test2.getName();
        test2.lockUp(test);
        */

        //*****************************************************
        //Actual Program Starts Here.
        //*****************************************************

        //Hard coded #'s, can be modified in future.
        System.out.println("Input the number of days to simulate:");
        Scanner in = new Scanner(System.in);
        while(!in.hasNextInt()) in.next();
        int days =  in.nextInt();
        System.out.println("Input the workload per day:");
        while(!in.hasNextInt()) in.next();
        int workload_per_day = in.nextInt();
        in.close();


        Random rand = new Random();
        int r = rand.nextInt(14);

        //First look instantiates Mechanic object, Garage Object, and vehicles on task queue for the day.
        for(int i=1; i<=days; i++){
            //Observer
            GarageAnnouncer ann = new GarageAnnouncer(r);
            r = rand.nextInt(14);
            //Observables
            Mechanic mech = new Mechanic(r);
            mech.addAnnouncer(ann);
            GarageClock clock = new GarageClock();
            clock.addAnnouncer(ann);

            Garage garage = new Garage();
            List<Vehicles> vehicles_to_work = new ArrayList<Vehicles>();
            //Populates vehicles_to_work arrayList with random Vehicle objects
            //Any car subclass objects are instantiated through Factory method
            for(int j=0; j<workload_per_day; j++){
                vehicles_to_work.add(garage.createVehicleObject());
            }

            //loop through the garage hours (8am - 8pm)
            //Evertime an hour passes, the announcer announces the new time
            //At certain hours, the mechanic will change its task
            for(int j=0; j <= 12; j++){
                clock.tick();
                int t = clock.getTime();
                switch(t){
                    case 9: //8am; tick() causes the time to be 1 ahead
                        for(int k=0; k < vehicles_to_work.size(); k++){
                            mech.unlock(vehicles_to_work.get(k));
                        }
                        break;
                    case 11: //10am
                        for(int k = 0; k < vehicles_to_work.size(); k++){
                            mech.wash(vehicles_to_work.get(k));
                        }
                        break;
                    case 14: //1pm
                        for(int k = 0; k < vehicles_to_work.size(); k++){
                            mech.tuneUp(vehicles_to_work.get(k));
                        }
                        break;
                    case 18: //5pm
                        for(int k = 0; k < vehicles_to_work.size(); k++){
                            //Condition for potential MonsterTruck crash
                            if(mech.testDrive(vehicles_to_work.get(k)) == false){
                                vehicles_to_work.remove(k);
                                //calling superclass constructor method replaces employee.
                                r = rand.nextInt(14);
                                mech = new Mechanic(r);
                                mech.addAnnouncer(ann);
                            }
                        }
                        break;
                    case 21: //8pm
                        for(int k = 0; k < vehicles_to_work.size(); k++){
                            mech.lockUp(vehicles_to_work.get(k));
                        }
                        break;
                }
            }
            mech.finish();

            //Output updates and formatting.
            System.out.println("\n");
            System.out.println("********************");
            System.out.println("Tasks for day " + i + " are COMPLETE.");
            System.out.println("********************");
            System.out.println("\n");
        }
    }
}
