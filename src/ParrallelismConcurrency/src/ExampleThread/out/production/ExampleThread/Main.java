package ParrallelismConcurrency.src.ExampleThread.out.production.ExampleThread;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arr = new int [20];
        for (int i = 0; i < 20; i++) {

            ExampleThread thread = new ExampleThread(i);
            thread.start();
            arr[i] = i+1;
        }

        System.out.println(Arrays.toString(arr));

    }
}