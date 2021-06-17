public class Electric extends Scooter{
    public Electric(){
        generatePlate("ELE");
    }

    //overloading runs method
    public void runs(){
        System.out.println(plate + " whooooshes.");
    }
}
