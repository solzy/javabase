import java.util.concurrent.*;
import java.util.*;


class Count{
    private int count = 0;
    private Random rand = new Random(48);

    public synchronized int increment(){
        int temp = count;
        if(rand.nextBoolean()){
            Thread.yield();
        }
        return (count = ++temp);

    }
    public synchronized int value(){return count;}
}
