import java.util.concurrent.*;

public class FixedThreadPool{
    public static void main(String[] args){
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for(int i = 0 ; i < 5 ; i ++){
            //The FixedThreadPool is similar with Array,
            //it must be set with fiexed size
            exec.execute(new LiftOff(2));
        }
        exec.shutdown();
    }
}

