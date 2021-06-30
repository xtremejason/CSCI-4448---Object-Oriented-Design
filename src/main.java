import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;

//By Jason Nguyen, Varunjit Srinivas, Isaac Sim

public class main {
    public static int menu(int time, InputSingleton scan){
        System.out.println("\n");
        if(time <= 12) System.out.println("It is currently " + time + " am...");
        else System.out.println("It is currently " + time % 12 + " pm...");
        System.out.println("What should the mechanic do?");
        System.out.println("\n");
        System.out.println("1. Unlock");
        System.out.println("2. Wash");
        System.out.println("3. Tune");
        System.out.println("4. Test Drive");
        System.out.println("5. Lock");
        System.out.println("6. Close Garage");
        System.out.println("\n");        

        int input = scan.getInt();
        return input;
    }

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
        System.out.println("A new day has arrived");
        Random rand = new Random();
        int r = rand.nextInt(14);
        //Observer
        //Observables
        Mechanic mech = new Mechanic(r);
        System.out.println("Mechanic " + mech.name + " has opened the garage...");

        Garage garage = new Garage();
        List<Vehicles> vehicles_to_work = new ArrayList<Vehicles>();
        //Populates vehicles_to_work arrayList with random Vehicle objects
        //Any car subclass objects are instantiated through Factory method
        for(int j=0; j < 12; j++){
            vehicles_to_work.add(garage.createVehicleObject(j));
        }
        boolean cont = true;
        boolean fired = false;
        boolean closed = false;
        int time = 9;
        boolean allUnlocked = true;
        InputSingleton scan = InputSingleton.getInstance();
        while(cont){
            for (Vehicles v : vehicles_to_work){
                if(v.getLockStatus()){
                    allUnlocked = false;
                }
            }
            if(allUnlocked & !closed){
                switch(menu(time, scan)){
                case 1:
                    System.out.println("All cars are already unlocked!");
                    break;
                case 2:
                    //wash all vehicles
                    for (Vehicles v : vehicles_to_work){
                        mech.takeTask(new Wash(v));
                    }
                    if(mech.executeTasks()) fired = true;
                    time += 2;
                    break;
                case 3:
                    for (Vehicles v : vehicles_to_work){
                        mech.takeTask(new Tune(v));
                    }
                    if(mech.executeTasks()) fired = true;
                    time += 4;
                    break;
                case 4:
                    for (Vehicles v : vehicles_to_work){
                        mech.takeTask(new Drive(v));
                    }
                    if(mech.executeTasks()) fired = true;
                    time += 3;
                    break;
                case 5:
                    mech.executeTasks();
                    for (Vehicles v : vehicles_to_work){
                        mech.takeTask(new Lock(v));
                    }
                    time += 1;
                    if(mech.executeTasks()) fired = true;
                    break;
                case 6:
                    System.out.println("Closing the garage for the day... Goodbye!");
                    cont = false;
                    break;
                default:
                    break;
                }
            }
            else if(!allUnlocked & !closed){
                switch(menu(time, scan)){
                case 1:
                    for (Vehicles v : vehicles_to_work){
                        mech.takeTask(new Unlock(v));
                    }
                    if(mech.executeTasks()) fired = true;
                    time += 1;
                    allUnlocked = true;
                    break;
                case 2:
                    System.out.println("All cars must be unlocked first!");
                    break;
                case 3:
                    System.out.println("All cars must be unlocked first!");
                    break;
                case 4:
                    System.out.println("All cars must be unlocked first!");
                    break;
                case 5:
                    System.out.println("All cars must be unlocked first!");
                    break;
                case 6:
                    System.out.println("Closing the garage for the day... Goodbye!");
                    cont = false;
                    break;
                default:
                    break;
                }
            }
            else{
                switch(menu(time, scan)){
                case 1:
                    System.out.println("It is time to close...");
                    break;
                case 2:
                    System.out.println("It is time to close...");
                    break;
                case 3:
                    System.out.println("It is time to close...");
                    break;
                case 4:
                    System.out.println("It is time to close...");
                    break;
                case 5:
                    System.out.println("It is time to close...");
                    break;
                case 6:
                    System.out.println("Closing the garage for the day... Goodbye!");
                    cont = false;
                    break;
                default:
                    break;
                }
            }
            if(time >= 20) closed = true;
            if(fired) {
                System.out.println("Mechanic " + mech.name + " has been fired!");
                System.out.println("Closing the garage for the day... Goodbye!");
                cont = false;
            }
        }
        //test for decoratotor - temporary - add later to myUnitTest class
        Vehicles veh = new Vehicles();
        Task task = new Wash(veh);
        task = new CeramicCoat(task);
        task = new CeramicCoat(task);
        task = new GlitterWax(task);
        System.out.println(task.getDescription());

        scan.close();
    }
}

