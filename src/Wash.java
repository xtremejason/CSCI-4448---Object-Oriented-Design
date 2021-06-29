public class Wash extends Task {
    
    public Wash(Vehicles veh){
        super(" washing ", veh);
    }

    public boolean execute(){
        return v.wash();
    }
}