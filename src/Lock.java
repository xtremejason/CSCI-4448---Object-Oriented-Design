public class Lock extends Task {
    
    public Lock(Vehicles veh){
        super(" locking ", veh);
    }

    public boolean execute(){
        return v.lock();
    }
}