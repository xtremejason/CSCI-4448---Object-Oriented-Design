//Factory method for all Car subclasses

public class CarFactory {
    public Car getCar(String carType){
        if (carType.equalsIgnoreCase("CONVERTIBLE")){
            return new Convertible();
        }
        else if (carType.equalsIgnoreCase("HATCHBACK")){
            return new Hatchback();
        }
        else if (carType.equalsIgnoreCase("SUV")){
            return new SUV();
        }
        else if (carType.equalsIgnoreCase("WAGON")){
            return new Wagon();
        }
        else{
            return null;
        }
    }
}