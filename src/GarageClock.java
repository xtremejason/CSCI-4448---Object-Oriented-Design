//GarageClock is the observable
public class GarageClock {
    GarageAnnouncer ann;
    int time = 8;

    public void addAnnouncer(GarageAnnouncer a){
        ann = a;
    }

    //Evertime time passes, send an update to the observer, GarageAnnouncer
    public void tick(){
        ann.updateTime(time);
        time++;
    }

    public int getTime(){
        return time;
    }
}
