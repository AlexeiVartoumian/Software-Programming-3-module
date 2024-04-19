package GradeScope2023.Concurrency;

public class PrintServer extends Thread{

    private final PrintQueue queue;

    public PrintServer(PrintQueue pq) {
        queue = pq;
    }

    @Override
    public void run() {

        while (true) {
            String toPrint = null;
            try {
                toPrint = queue.takeFromQueue();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // do the real printing ...
            System.out.println("Removed [" + toPrint + "]");
        }
    }
}
