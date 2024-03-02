package worksheet10.src.DiningPhilsophers;



public class Main {
    public static void main(String[] args) {
        int numberofPhilsophers = 10;
        Waiter waiter = new Waiter(numberofPhilsophers);
        Thread[] philsophers = new Thread[numberofPhilsophers];
        for (int i = 0; i < numberofPhilsophers; i++) {
            var philsopher = new Philsopher(waiter, i );
            philsophers[i] = new Thread(philsopher);
        }

        for (int i = 0; i <numberofPhilsophers; i++) {
            philsophers[i].start();
        }
    }
}
