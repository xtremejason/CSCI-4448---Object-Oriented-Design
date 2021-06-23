//Garagge Announcer is the observer
public class GarageAnnouncer extends GarageEmployee {
    String task = "";

    public GarageAnnouncer(int r){
        super(r);
    }

    //The observer first checks if the update is a different task than the one the mechanic was doing
    //If the task is at hand is now different the announcer announces it
    public void update(String t){
        if (!task.equals(t)){
            switch(t){
                case "UNLOCK":
                    System.out.println(name + " here! The mechanic is about to unlock the vehicles!");
                    break;
                case "WASH":
                    System.out.println(name + " here! The mechanic is about to wash the vehicles!");
                    break;
                case "TUNE":
                    System.out.println(name + " here! The mechanic is about to tune up the vehicles!");
                    break;
                case "TEST":
                    System.out.println(name + " here! The mechanic is about to test drive the vehicles!");
                    break;
                case "LOCK":
                    System.out.println(name + " here! The mechanic is about to lock the vehicles!");
                    break;
                case "FINISH":
                    System.out.println(name + " here! The mechanic has finished of all the tasks. Goodbye!");
                    System.out.println(name + " leaves the garage");
            }
            task = t;
        }
    }

    //The observer updates the time when the clock sends a ping
    public void updateTime(int t){
        if(t > 12){
            System.out.println(name + " here! It is now " + t % 12 + " pm.");
        }
        else{
            System.out.println(name + " here! It is now " + t+ " am.");
        }
    }
}
