//This class looks bare, however it is much more capable due to use of
//Polymorphism. It has methods and qualities that exist and have been
//implemented in superclasses.
//Benefits include code reuse, Ease of management and expandability, faster execution.

public class Convertible extends Car{
    public Convertible(){
        generatePlate("CNV");
    }

    //overload runs method
    public boolean runs(){
        System.out.println(plate + " skrrrrrt");
        return true;
    }

    //Overload wash method for specified washing print statements.
    public boolean wash(){
        shineStatus = true;
        System.out.println(plate + " is Soaped. " + plate + " is Scrubbed. " + plate + " is Rinsed. " + plate + " is Dried. " + plate + " is Waxed. " + plate + " is Detailed. " + plate + " is Detailed.");
        if(Math.random() < .7) {
            System.out.println(plate + " Shines in the sun.");
        } else {
            System.out.println(plate + " Sparkles so bright!!");
        }
        return true;
    }
}
