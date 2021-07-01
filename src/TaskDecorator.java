public abstract class TaskDecorator extends Task{
    Task task;
    public abstract String getDescription();

    /*
    public TaskDecorator(String n, Vehicles veh) {
        super(n, veh);
    }

    public TaskDecorator(Task task) {
        this.task = task;
    }
    */


}
