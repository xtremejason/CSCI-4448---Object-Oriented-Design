public class CeramicCoat extends TaskDecorator{
    /*
    public CeramicCoat(String n, Vehicles veh) {
        super(n, veh);
    }
    */
    public CeramicCoat(Task task){
        this.task = task;
    }

    public String getDescription(){
        return task.getDescription() + "Ceramic Coating has been applied! ";
    }
}
