package ParrallelismConcurrency.src.SummingThreadsWithBlock;

public class SumThread extends Thread{

    int low;
    int high;

    int[] arr;
    int ans= 0;
    public SumThread(int[] arr, int low, int high){
        this.low = low;
        this.high = high;
        this.arr = arr;
    }

    @Override
    public void run(){

        for(int i = low; i <=high ; i++) {
            ans += arr[i];
        }

        System.out.println("final operation sum for index" + low  + " " + high + " " + ans);
    }


}
