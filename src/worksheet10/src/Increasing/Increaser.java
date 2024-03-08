package worksheet10.src.Increasing;

public class Increaser implements Runnable{
    private Counter counter;
    public Increaser(Counter counter){
        this.counter = counter;
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        for (int i = 0; i <100 ; i++) {
            Increaser increaserTask = new Increaser(counter);
            Thread t = new Thread(increaserTask);
            t.start();
            t.join();
        }
        Thread.sleep(1000);
        System.out.println(counter.getCount());
        Thread.sleep(1000);
        System.out.println(counter.getCount());
        Thread.sleep(1000);
        System.out.println(counter.getCount());
    }
    public void run(){
        System.out.println("Starting at " + counter.getCount());
        for (int i = 0; i < 1000; i++) {
            counter.increase();
        }
        System.out.println("stopping at " + counter.getCount());
    }
}
