//Aggregates all test cases into this single class for simple use.

public class MyUnitTest {

        public void runAllTests() {
            //Formatting for Test
            System.out.println("*********** >> JUnit Test Begins Here <<*************");
            System.out.println("*****************************************************");
            System.out.println("*****************************************************");

            //Test1
            ElectricTest electricTest = new ElectricTest();
            try {
                electricTest.Electric();
                System.out.println("** Electric Test Successful. **");
            }catch(IndexOutOfBoundsException e){
                System.out.println("** Electric Test Failed. **");
            }


            //Test2
            MechanicTest mechTest1 = new MechanicTest();
            try {
                mechTest1.addAnnouncer();
                System.out.println("** Mechanic Test 1 Successful. **");
            }catch(IndexOutOfBoundsException e){
                System.out.println("** Mechanic Test 1 Failed. **");
            }

            //Test3
            MechanicTest mechTest2 = new MechanicTest();
            try {
                mechTest2.setName();
                System.out.println("** Mechanic Test 2 Successful. **");
            }catch(IndexOutOfBoundsException e){
                System.out.println("** Mechanic Test 2 Failed. **");
            }

            //Test4
            SidecarTest sidecarTest1 = new SidecarTest();
            try {
                sidecarTest1.Sidecar();
                System.out.println("** Sidecar Test 1 Successful. **");
            }catch(IndexOutOfBoundsException e){
                System.out.println("** Sidecar Test 1 Failed. **");
            }


            //Test5
            SUVTest suvTest = new SUVTest();
            try {
                suvTest.SUV();
                System.out.println("** SUV Test 1 Successful. **");
            }catch(IndexOutOfBoundsException e){
                System.out.println("** SUV Test 1 Failed. **");
            }

            //Test6
            TaskDecoratorTest taskDecoratorTest = new TaskDecoratorTest();
            try {
                taskDecoratorTest.getDescription();
                System.out.println("** TaskDecorator Test Successful. **");
            }catch(IndexOutOfBoundsException e){
                System.out.println("** TaskDecorator Test Failed. **");
            }

            //Test7
            TrikeTest trikeTest = new TrikeTest();
            try {
                trikeTest.Trike();
                System.out.println("** Trike Test Successful. **");
            }catch(IndexOutOfBoundsException e){
                System.out.println("** Trike Test Failed.");
            }

            //Test8
            TruckTest truckTest = new TruckTest();
            try {
                truckTest.Truck();
                System.out.println("** Truck Test Successful. **");
            }catch(IndexOutOfBoundsException e){
                System.out.println("** Truck Test Failed. **");
            }

            //Test9
            VehiclesTest vehTest1 = new VehiclesTest();
            try {
                vehTest1.getLockStatus();
                System.out.println("** Vehicle Test 1 Successful. **");
            }catch(IndexOutOfBoundsException e){
                System.out.println("** Vehicle Test 1 Failed. **");
            }

            //Test10
            VehiclesTest vehTest2 = new VehiclesTest();
            try {
                vehTest2.unlock();
                System.out.println("** Vehicle Test 2 Successful. **");
            }catch(IndexOutOfBoundsException e){
                System.out.println("** Vehicle Test 2 Failed. **");
            }

            //Test11
            VehiclesTest vehTest3 = new VehiclesTest();
            try {
                vehTest3.shine();
                System.out.println("** Vehicle Test 3 Successful. **");
            }catch(IndexOutOfBoundsException e){
                System.out.println("** Vehicle Test 3 Failed. **");
            }


            //Test12
            VehiclesTest vehTest4 = new VehiclesTest();
            try {
                vehTest4.tune();
                System.out.println("** Vehicle Test 4 Successful. **");
            }catch(IndexOutOfBoundsException e){
                System.out.println("** Vehicle Test 4 Failed. **");
            }


            System.out.println("ALL TESTS HAVE PASSED!");


            //Formatting for Test
            System.out.println("*****************************************************");
            System.out.println("*****************************************************");
            System.out.println("*************** >> JUnit Test End <<*****************");
        }
}

