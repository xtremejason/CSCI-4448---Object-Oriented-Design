//Aggregates all test cases into this single class for simple use.

public class MyUnitTest {

        public void runAllTests() {
            //Formatting for Test
            System.out.println("*********** >> JUnit Test Begins Here <<*************");
            System.out.println("*****************************************************");
            System.out.println("*****************************************************");

            //Test1
            ElectricTest test = new ElectricTest();
            test.Electric();

            //Test2
            MechanicTest mechTest1 = new MechanicTest();
            mechTest1.addAnnouncer();

            //Test3
            MechanicTest mechTest2 = new MechanicTest();
            mechTest2.setName();

            //Test4
            SidecarTest sidecarTest1 = new SidecarTest();
            sidecarTest1.Sidecar();

            //Test5
            SUVTest suvTest = new SUVTest();
            suvTest.SUV();

            //Test6
            TaskDecoratorTest taskDecoratorTest = new TaskDecoratorTest();
            taskDecoratorTest.getDescription();

            //Test7
            TrikeTest trikeTest = new TrikeTest();
            trikeTest.Trike();

            //Test8
            TruckTest truckTest = new TruckTest();
            truckTest.Truck();

            //Test9
            VehiclesTest vehTest1 = new VehiclesTest();
            vehTest1.getLockStatus();

            //Test10
            VehiclesTest vehTest2 = new VehiclesTest();
            vehTest2.unlock();

            //Test11
            VehiclesTest vehTest3 = new VehiclesTest();
            vehTest3.shine();

            //Test12
            VehiclesTest vehTest4 = new VehiclesTest();
            vehTest4.tune();

            System.out.println("ALL TESTS HAVE PASSED!");


            //Formatting for Test
            System.out.println("*****************************************************");
            System.out.println("*****************************************************");
            System.out.println("*************** >> JUnit Test End <<*****************");
        }
}

