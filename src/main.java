import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

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





    }
}
