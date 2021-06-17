public class Monster extends Truck{
    //constructor
    public Monster(){
        generatePlate("MON");
    }

    //method overloading - polymorphism
    public void runs(){
        System.out.println(plate + " Vrooooms");
    }

    //Coded for spontaneous event where test driving Crashes.
    public boolean drive(){
        if (Math.random() > .8){
            System.out.println(plate + " Drives");
            return true;
        } else{
            System.out.println(plate + " CRASHES!");
            return false;
        }
    }
}
