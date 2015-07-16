import java.util.concurrent.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0 ; i < 3 ; i++){
            exec.execute(new Entrance(i));
        }
        TimeUnit.SECONDS.sleep(3);
        
        Entrance.cancel();

        if(! exec.awaitTermination(200 , TimeUnit.MILLISECONDS)){
            System.out.println("some task were not terminated!");
        }
    
        System.out.println("Total :  "+ Entrance.getTotalCount());
        System.out.println("Sum of Entrances: " + Entrance.sumEntrances());

    }
}
