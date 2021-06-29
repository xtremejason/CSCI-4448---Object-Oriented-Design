public class Unlock extends Task {
    
    public Unlock(Vehicles veh){
        super(" unlocking ", veh);
    }

    public boolean execute(){
        return v.unlock();
    }
}