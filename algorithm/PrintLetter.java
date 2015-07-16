import java.util.concurrent.atomic.AtomicInteger;

class PrintLetter implements Runnable {
    AtomicInteger count;
    String letter;

    PrintLetter(AtomicInteger count, String letter) {
        this.count = count;
        this.letter = letter;
    }

    @Override
    public void run() {
        synchronized (count) {
            while (count.get() <= 10) {
                if(letter.equals("A"))
                System.out.println("A");
                count.notifyAll();
                count.getAndAdd(1);
            }
        }
    }
}