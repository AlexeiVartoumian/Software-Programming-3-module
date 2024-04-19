package GradeScope2023.Concurrency;

public class PrintQueue {
    private PrintJob firstToPrint;
    private PrintJob lastToPrint;
    private int length;

    public PrintQueue() {
        firstToPrint = null;
        lastToPrint = null;
        length = 0;
    }

    public synchronized void  addToQueue(String str) {
        PrintJob pJob = new PrintJob(str);
        if (emptyQueue())
            firstToPrint = pJob;
        else
            lastToPrint.setFollowingJob(pJob);

        lastToPrint = pJob;
        length++;
        notifyAll();
        //System.out.println( length +  " " + pJob.getWhatToPrint());
    }

    public synchronized String takeFromQueue() throws InterruptedException {
        while (emptyQueue()) {
            wait();
        }
        PrintJob forReturning = firstToPrint;

        firstToPrint = firstToPrint.getFollowingJob();
        length--;

        if (emptyQueue())
            lastToPrint = null;

        return forReturning.getWhatToPrint();
    }
    public int getLength(){
        return this.length;
    }

    private boolean emptyQueue() {
        return length == 0;
    }
}
