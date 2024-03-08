package ParrallelismConcurrency.src.ExampleThread.out.production.ExampleThread;

public class ExampleThread  extends Thread{

    private int i;
    ExampleThread(int i ){
        this.i = i;
    }

    public void run(){
        System.out.println("I am process number " + i + " how you doins");

        System.out.println("I am process number " + i + " checking out");
    }
}
