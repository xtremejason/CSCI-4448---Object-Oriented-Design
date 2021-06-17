public class Monster extends Truck{
    public Monster(){
        generatePlate("MON");
    }

    public void runs(){
        System.out.println(plate + " Vrooooms");
    }

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
