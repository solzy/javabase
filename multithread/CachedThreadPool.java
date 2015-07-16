import java.util.concurrent.*;

public class CachedThreadPool{
    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0 ; i < 5 ; i ++){
            //The CachedThreadPool is similar with List container
            //it is filled when task is created.
            exec.execute(new LiftOff(2));
        }
        exec.shutdown();
    }
}

