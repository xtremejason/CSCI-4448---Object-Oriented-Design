public class Drive extends Task {
    
    public Drive(Vehicles veh){
        super(" test driving ", veh);
    }

    public boolean execute(){
        return v.drive();
    }
}