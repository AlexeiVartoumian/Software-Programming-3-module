package ParrallelismConcurrency.src.SummingThreadsWithBlock;

public class SummingArrThreads {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int [20];
        for (int i = 0; i < 20; i++) {
            arr[i] = i+1;
        }

        SummingArrThreads.getFour(arr);

    }

    static int getFour(int[]arr ) throws InterruptedException {
        int start =0;
        int len = arr.length;
        SumThread[] threads = new SumThread[4];

        int answer = 0;
        for (int i = 1; i <= 4; i++) {
            SumThread thread = new SumThread(arr,  ((i -1) * len)/4 ,((i * len)/4)-1 );
            System.out.println(((i -1) * len)/4 + " " +   arr[((i -1) * len)/4] );
            System.out.println( ((i * len)/4 )-1 + " " + arr[((i * len)/4 )-1] );
            threads[i-1] = thread;
            threads[i-1].start();
        }
        //so without applying a blocking operation threads.join the main class will not
        //wait for a operation to complete. the important thing to note here is that
        // while we are summing up the summed element is being overwritten. we have a data hazard.
//        for (int i = 0; i <threads.length ; i++) {
//            threads[i].join();
//        }
        /**
         * what is being done above is explained much better here
         * Essentially, we are using two for-loops, where the first one creates helper threads and the second one
         * waits for them all to terminate, to encode the idea of a FORALL-loop. This style of parallel programming is
         * called “fork-join parallelism.” It is like we create a “(4-way in this case) fork in the road of execution” and
         * send each helper thread down one path of the fork. Then we join all the paths of the fork back together and
         * have the single main thread continue. Fork-join parallelism can also be nested, meaning one of the helper
         * threads forks its own helper threads. In fact, we will soon argue that this is better style. The term “join”
         * is common in different programming languages and libraries, though honestly it is not the most descriptive
         * English word for the concept
         *
         * the above is synonomous with writing it like so
         * for(int i=0; i < 4; i++) {
         * ts[i].join();
         * ans += ts[i].ans;
         * }
         * return ans;
         */
        for (int i = 0; i < threads.length; i++) {
            answer += threads[i].ans;
        }
        System.out.println("threaded operation sum is " + answer );
        return answer;
    }
}
