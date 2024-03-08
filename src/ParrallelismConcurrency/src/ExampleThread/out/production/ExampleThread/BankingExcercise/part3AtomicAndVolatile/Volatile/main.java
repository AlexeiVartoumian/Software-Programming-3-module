package ParrallelismConcurrency.src.ExampleThread.out.production.ExampleThread.BankingExcercise.part3AtomicAndVolatile.Volatile;

public class main {
    public static void main(String[] args) {
        /**
         * VOLATILE! -->
         * volatile has been there since the beginning. tells the compiler we cannot rely
         * on the value being stored there. Instructions may need to be re-ordered
         * dont cache the values - guarding against this.
         * It is a lock-free mechanism but allows synchronisation on a field.
         * the application of locks is now the responsibility of the compiler.
         * WE CAN ONLY ASSIGN AND RETRIEVE FROM A VOLATILE FIELD. CANNOT DO CALCULATIONS
         *
         *
         */
    }
}

class EXampleOne{
    private boolean done;

    private synchronized boolean isDone(){return done;}
    private synchronized void setDone(){done = true;};
}

class ExampleTwo{
    private volatile boolean done;
    public boolean isDone(){return done;}
    public void setDone(){done = true;}
}
