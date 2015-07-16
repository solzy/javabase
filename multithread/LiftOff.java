public class LiftOff implements Runnable{
    protected int countDown = 10;
    private static int taskCount = 0;
    //To identify different instance
    private final int id = taskCount++;

    public LiftOff( int countDown ){
        this.countDown = countDown;
    }

    public String status(){
        return "#"+id +"(" +
            (countDown > 0 ? countDown : "LiftOff") + ")";
    }

    public void run(){
        while(countDown-- > 0){
            System.out.println(status());
            //Switch CPU to other thread
     //       Thread.yield();
        }
    }

}
