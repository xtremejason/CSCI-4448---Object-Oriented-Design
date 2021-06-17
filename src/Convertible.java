public class Convertible extends Car{
    public Convertible(){
        generatePlate("CNV");
    }

    //overload runs method
    public void runs(){
        System.out.println(plate + " skrrrrrt");
    }
}
