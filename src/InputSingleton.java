import java.util.Scanner;

public class InputSingleton {
    private Scanner scan;
    private static InputSingleton instance = null;
    private boolean closed;
    
    private InputSingleton(){
        closed = false;
        scan = new Scanner(System.in);
    }

    public static synchronized InputSingleton getInstance(){
        if(instance == null){
            instance = new InputSingleton();
        }
        return instance;
    }

    public int getInt(){
        while(!scan.hasNextInt()) scan.next();
        return scan.nextInt();
    }

    public void close(){
        closed = true;
        scan.close();
    }
}
