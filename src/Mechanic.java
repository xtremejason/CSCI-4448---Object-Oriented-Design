import java.util.ArrayList;
import java.util.List;
//Mechanic is the observable
public class Mechanic extends GarageEmployee{
    //Default Constructor
    private List<Task> tasks = new ArrayList<Task>();
    GarageAnnouncer ann;

    Mechanic(int r){
        super(r);
    }

    public void addAnnouncer(GarageAnnouncer a){
        ann = a;
    }

    public void takeTask(Task t){
        tasks.add(t);
    }

    public boolean executeTasks(){
        boolean fired = false;
        for (Task t : tasks){
            System.out.println(name + t.name + t.v.plate + ".");
            if(!t.execute()){
                fired = true;
                break;
            }
        }
        tasks.clear();
        return fired;
    }
}