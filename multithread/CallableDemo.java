import java.util.concurrent.*;
import java.util.*;

public class CallableDemo{
    class TaskWithResult implements Callable<String>{
        private int id;

        public TaskWithResult(int id){
            this.id = id;
        }

        public String call(){
            return "result of TaskWithResult " + id;
        }
    }

    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> res = 
            new ArrayList<Future<String>>();

        for(int i = 0; i < 10 ; i++){
            CallableDemo cd = new CallableDemo();
            res.add(exec.submit(cd.new TaskWithResult(i)));
        }

        try{
            for(Future<String> fs : res){
             //get() blocks until completion
                System.out.println(fs.get());
            }
        }catch(InterruptedException e){
            System.out.println(e);
            return;
        }catch(ExecutionException e){
            System.out.println(e);
        }finally{
            exec.shutdown();
        }
    }

}
