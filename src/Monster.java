public class Monster extends Truck{
    //constructor
    public Monster(){
        generatePlate("MON");
    }

    //method overloading - polymorphism
    public boolean runs(){
        System.out.println(plate + " Vrooooms");
        return true;
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

    //Overload wash method for more detailed wash print statements.
    public boolean wash(){
        shineStatus = true;
        System.out.println(plate + " is Soaped. " + plate + " is Scrubbed. " + plate + " is Rinsed. " + plate + " is Dried." + plate + " is Waxed. " + plate + " is Waxed. " + plate + " is Polished. " + plate + " is Detailed.");
        if(Math.random() < .7) {
            System.out.println(plate + " Shines in the sun.");
        } else {
            System.out.println(plate + " Sparkles so bright!!");
        }
        return true;
    }
}
