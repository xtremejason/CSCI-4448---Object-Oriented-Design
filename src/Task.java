abstract class Task{
    public String name;
    public Vehicles v;
    public Task(String n, Vehicles veh){
        name = n;
        v = veh;
    }
    boolean execute(){ return true; }
}