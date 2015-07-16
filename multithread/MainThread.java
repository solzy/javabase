public class MainThread{
    public static void main(String[] args){
        LiftOff launch = new LiftOff(10);
        Thread t = new Thread(launch);
        t.start();
        System.out.println("Main Thread!");
    }
}
