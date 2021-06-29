public class Tune extends Task {
    
    public Tune(Vehicles veh){
        super(" tuning ", veh);
    }

    public boolean execute(){
        return v.tune();
    }
}