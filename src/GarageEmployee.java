/*
Abstract class used for Inheritance and Polymorphism to Mechanic class.
Objects cannot be created for abstract classes, but it is useful to Mechanic class
and potentially new classes in the future. Allows for modularity.
 */
public abstract class GarageEmployee {

    String name;
    String[] names = {"Bobby", "Joe", "Andrea","Timothy","Audrey","Madison","Devin","Ashley","Brenda","Cody","AJ","Randy","Lisa","Steve","Will"};

    //constructor sets name of employee and prints update.
    public GarageEmployee(int r){
        name = names[r];
        System.out.println(name + " arrives to work");
    }

    //manually sets name
    public void setName(String n){
        name = n;
    }

    //name getter
    public void getName(){
        System.out.println(name);
    }


}
