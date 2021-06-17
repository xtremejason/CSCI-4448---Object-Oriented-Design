import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
//By Varunjit Srinivas and Jason Nguyen

public class main {

    //For running test cases
    public static void main(String[] args) {
        //Vehicles test = new Vehicles('t');
        Bike test = new Bike();
        test.lock();
        test.getPlate();

        //Testing for Mechanic -> GarageEmployee super/sub-class
        Mechanic test2 = new Mechanic();
        test2.GarageEmployee();
        test2.getName();
        test2.lockUp(test);


        //Actual Program
        //public List<Vehicles>;

        //Hard coded #'s, can be modified in future.
        int days = 10;
        int workload_per_day = 5;

        for(int i=1; i<=days; i++){
            Mechanic mech = new Mechanic();
            mech.GarageEmployee();
            Garage garage = new Garage();
            List<Vehicles> vehicles_to_work = new ArrayList<Vehicles>();

            for(int j=0; j<workload_per_day; j++){
                vehicles_to_work.add(garage.createVehicleObject());
            }

            for(int k=0; k < vehicles_to_work.size(); k++){
                mech.unlock(vehicles_to_work.get(k));
                mech.wash(vehicles_to_work.get(k));
                mech.tuneUp(vehicles_to_work.get(k));

                //Condition for potential MonsterTruck crash
                if(mech.testDrive(vehicles_to_work.get(k)) == false){
                    vehicles_to_work.remove(k);
                    //calling superclass constructor method replaces employee.
                    mech.GarageEmployee();
                }
                //mech.testDrive(vehicles_to_work.get(k));
                mech.lockUp(vehicles_to_work.get(k));
            }

            System.out.println("\n");
            System.out.println("********************");
            System.out.println("Tasks for day " + i + " are COMPLETE.");
            System.out.println("********************");
            System.out.println("\n");



        }



    }
}
