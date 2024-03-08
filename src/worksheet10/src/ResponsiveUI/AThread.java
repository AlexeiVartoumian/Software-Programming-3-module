package worksheet10.src.ResponsiveUI;

public class AThread implements Runnable{

    int id;
    static int numThreads = 0;
    int time;

    public AThread(int time){
        this.id = numThreads;
        numThreads++;
        this.time = time;

    }

    @Override
    public void run(){
        try {
            sleep();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.id + " thread has finished executing"  );
        Main.tasks.add(getId());

    }
    public void sleep() throws InterruptedException {
        Thread.sleep(time);
    }

    public int getId() {
        return id;
    }
}
