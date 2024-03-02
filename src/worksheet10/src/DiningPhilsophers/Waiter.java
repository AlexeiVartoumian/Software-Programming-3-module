package worksheet10.src.DiningPhilsophers;

import java.util.Arrays;

public class Waiter {

    boolean[]forks;
    int[]waiting;

    public Waiter(int numPhilsophers){
        forks = new boolean[numPhilsophers];
        waiting = new int[numPhilsophers];
        Arrays.fill(forks, true);
        Arrays.fill(waiting, 0);
    }

    public synchronized void getForks(int id) throws InterruptedException {

        int leftFork = (id - 1 + forks.length) % forks.length;
        int rightFork = (id + 1) % forks.length;

        while (!forks[leftFork] || !forks[rightFork]) {

            if (!forks[leftFork]) {
                waiting[id]++;
                wait();
                waiting[id]--;

            }
            if (!forks[rightFork]) {
                waiting[id]++;
                wait();
                waiting[id]--;
            }
        }
        System.out.println("Philospher" + id + "is Eating");
        forks[leftFork] = false;
        forks[rightFork] = false;
    }
    public synchronized void releaseForks(int id){

        int leftFork = (id -1 + forks.length) % forks.length;
        int rightFork = (id + 1) % forks.length;
        System.out.println("Philsopher " + id + " is reealsing forks" + leftFork + " " + rightFork);
        forks[leftFork] = true;
        forks[rightFork] = true;
        if (waiting[leftFork] >0){

            notify();
        }
        if(waiting[rightFork] > 0){

            notify();
        }

        }

}
