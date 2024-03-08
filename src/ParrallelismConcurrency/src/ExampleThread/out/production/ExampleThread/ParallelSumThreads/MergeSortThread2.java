package ParrallelismConcurrency.src.ExampleThread.out.production.ExampleThread.ParallelSumThreads;

public class MergeSortThread2  extends Thread {


    int low;
    int high;
    int[] arr;

    int answer = 0;
    /**
     * because of the number of threads we are creating using the merge sort process i.e 6 threads for 4 elements.
     * a tradeoff is required where we can Substantially remove the overhead of the number of threads produced for say a
     * billion elements if we dont create them below a certain threshold
     */
    static final int SEQUENTIALCUTOFFS = 1000;

    MergeSortThread2(int[] arr , int low, int high){
        this.arr = arr;
        this.low = low;
        this.high = high;
    }

    @Override
    public void run() {
        if (high - low < SEQUENTIALCUTOFFS) {
            for (int i = low; i < high; i++) {
                answer += arr[i];
            }

        } else {
            if (high - low == 1) {
                answer = arr[low];
            } else {
                MergeSortThread left = new MergeSortThread(arr, low, (high + low) / 2);
                MergeSortThread right = new MergeSortThread(arr, (high + low) / 2, high);

                /**
                 * The difference here is that only one helper thread is created with left.start()
                 * while the other thread is being directly run by the main method itself.
                 */

                left.start();

                right.run();

                try {
                    left.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                answer = left.answer + right.answer;
            }
        }
    }

    int sum(int[]arr){
        MergeSortThread2 thread = new MergeSortThread2(arr, 0 , arr.length);
        thread.run();

        return thread.answer;
    }
}
