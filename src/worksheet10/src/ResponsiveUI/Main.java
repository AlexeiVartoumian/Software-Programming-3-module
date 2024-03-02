package worksheet10.src.ResponsiveUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static List<Integer> tasks = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {



        System.out.println("Please give input ");
        int num= scanner.nextInt();
        System.out.println(num);
        int count = 0;

        while (count < 10){
            System.out.println("Enter the duration (in ms) of task " + count);
            int time = scanner.nextInt();
            Thread newThread = new Thread(new AThread(time));
            newThread.start();
            count+=1;
            System.out.println(tasks);
        }
    }



}
