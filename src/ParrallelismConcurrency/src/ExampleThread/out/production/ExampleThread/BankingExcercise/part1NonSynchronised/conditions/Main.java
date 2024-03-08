package ParrallelismConcurrency.src.ExampleThread.out.production.ExampleThread.BankingExcercise.part1NonSynchronised.conditions;

public class Main {

    static final int NUMBER_OF_ACCOUNTS = 100;
    static final double INITIAL_BALANCE = 1_000;
    static final double MAX_AMOUNT = 1_000;
    static final int DELAY = 10;

    public static void main(String[] args) {

        var bank = new Bank(NUMBER_OF_ACCOUNTS,INITIAL_BALANCE);
        for (int i = 0; i < NUMBER_OF_ACCOUNTS; i++) {
            int fromAccount = i;
            Runnable r = () -> {
                try {
                    while(true){
                        int toAccount = (int) (bank.size() * Math.random());
                        double amount = MAX_AMOUNT * Math.random();
                        bank.transfer(fromAccount,toAccount,amount);
                        Thread.sleep((int)(DELAY + Math.random()));
                    }
                }catch(InterruptedException e){
                };
            };
            var t = new Thread(r);
            t.start();
        }
    }
}
