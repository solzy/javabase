import java.util.concurrent.*;

public class SingleThreadExecutor{
    public static void main(String[] args){
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for(int i = 0 ; i < 5 ; i ++){
            //The SingleThreadExecutor only creats one Thread.
            //All task are sequentially executed in this Thread 
            exec.execute(new LiftOff(2));
        }
        exec.shutdown();
    }
}

