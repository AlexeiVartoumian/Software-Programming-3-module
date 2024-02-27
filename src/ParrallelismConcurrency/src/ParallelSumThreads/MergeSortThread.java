package ParrallelismConcurrency.src.ParallelSumThreads;

public class MergeSortThread  extends Thread {


    int low;
    int high;
    int[] arr;

    int answer = 0;

    MergeSortThread(int[] arr , int low, int high){
        this.arr = arr;
        this.low = low;
        this.high = high;
    }

    @Override
    public void run() {
        if(high- low == 1){
            answer= arr[low];
        }
        else{
            MergeSortThread left = new MergeSortThread(arr, low, (high+ low)/2);
            MergeSortThread right = new MergeSortThread(arr, (high+low)/2, high);

            left.start();
            right.start();
            /**
             * Brilliant! the join methods are simulating the way mergesort works!
             *
             */
            try {
                left.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                right.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            answer = left.answer + right.answer;
        }
    }

    int sum(int[]arr){
        MergeSortThread thread = new MergeSortThread(arr, 0 , arr.length);
        thread.run();

        return thread.answer;
    }
}
