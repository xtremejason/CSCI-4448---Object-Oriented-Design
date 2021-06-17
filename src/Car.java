public class Car extends Vehicles{

    public Car(){
        generatePlate("CAR");
    }

    public void tune(){
        tunedStatus = true;
        if(Math.random() > .75){
            runStatus = "runs";
            System.out.println("The vehicle " + plate + " " + runStatus);
        } else{
            runStatus = "sputters";
            System.out.println("The vehicle " + plate + " " + runStatus);
        }
    }
}
