package GradeScope2023.Concurrency;

public class Client extends  Thread{


    private PrintQueue printQueue;
    private String string;

    public Client(PrintQueue printQueue, String string){
        this.printQueue = printQueue;
        this.string = string;
    }
    @Override
    public void run(){

        while(true) {
            try {
                Thread.sleep(1000);
                addtoQueue(string);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public synchronized void  addtoQueue(String name){
        this.printQueue.addToQueue(name);

    }

}
