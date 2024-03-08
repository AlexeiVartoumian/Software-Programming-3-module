package ParrallelismConcurrency.src.ExampleThread.out.production.ExampleThread.BankingExcercise.part1NonSynchronised.race;

import java.util.Arrays;

public class Bank {
    private final double[] accounts;
    private final int SIZE;

    public Bank(int n , double initialBalance){
        accounts = new double[n];
        SIZE = n;
        Arrays.fill(accounts , initialBalance);
    }

    public void transfer(int from ,int to ,double amount){

        //Caution: writing to field Data hazard not thread safe
        if(accounts[from] < amount) return;
        System.out.println(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf(" %10.2f from %d to %d ", amount, from , to);
        accounts[to] += amount;

        System.out.printf("Total balance %10.2f%n",getTotalBalance());
    }

    public double getTotalBalance(){
        double sum = 0;
        for(double a : accounts){
           sum+= a;
        }
        return sum;
    }
    public int size(){
        return SIZE;
    }
}
