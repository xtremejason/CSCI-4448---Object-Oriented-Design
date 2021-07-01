public class GlitterWax extends TaskDecorator{
    public GlitterWax(Task task){
        this.task = task;
    }

    public String getDescription(){
        return task.getDescription() + "GlitterWax has been applied! ";
    }
}