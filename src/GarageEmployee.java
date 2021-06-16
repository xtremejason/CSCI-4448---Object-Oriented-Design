import java.util.Random;

public abstract class GarageEmployee {

    String name;
    String[] names = {"Bobby", "Joe", "Andrea","Timothy","Audrey","Madison","Devin","Ashley","Brenda","Cody","AJ","Randy","Lisa","Steve","Will"};

    //constructor sets name of employee
    public void GarageEmployee(){
        Random rand = new Random();
        int randomNum = rand.nextInt(14);
        name = names[randomNum];
    }

    //manually sets name
    public void setName(String n){
        name = n;
    }

    public void getName(){
        System.out.println(name);
    }

}
