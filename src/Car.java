public class Car extends Vehicles{

    public Car(){
        generatePlate("CAR");
    }

    //Adds condition for spontaneous sputter event for Car
    public boolean tune(){
        tunedStatus = true;
        if(Math.random() > .75){
            runStatus = "runs";
            System.out.println("The vehicle " + plate + " " + runStatus);
        } else{
            runStatus = "sputters";
            System.out.println("The vehicle " + plate + " " + runStatus);
        }
        return true;
    }
}
