import java.util.concurrent.*;
import java.util.*;

public class Entrance implements Runnable{
    private static Count count = new Count();
    private static List<Entrance> entrances = new ArrayList<Entrance>();
    private static ThreadLocal<Integer> number = new ThreadLocal<Integer>( ){
                            protected synchronized Integer initialValue(){
                                return 0;
                            }
                        };
    private final int id;
    private static volatile boolean canceled = false;

    public static void cancel(){ canceled = true;}
    
    public Entrance(int id){
        this.id = id;
        entrances.add(this);
    }

    public void run(){
        while(!canceled){
            number.set(number.get()+1);
            System.out.println(this + "Total:" + count.increment());
            try{
                TimeUnit.MILLISECONDS.sleep(98);
            }catch( InterruptedException e){
                System.out.println("sleep interrupted!");
            }
        }
        System.out.println("stop " + this);
    }

    public int getValue(){
        return number.get();
    }

    public String toString(){
        return "Entrance " + id + ": " + getValue();
    }

    public static int getTotalCount(){
        return count.value();
    }

    public static int sumEntrances(){
        int sum = 0;
        for( Entrance e : entrances){
            sum += e.getValue();
        }
        return sum;
    }

}
