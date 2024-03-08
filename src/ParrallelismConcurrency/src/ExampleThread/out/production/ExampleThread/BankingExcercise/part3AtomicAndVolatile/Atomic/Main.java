package ParrallelismConcurrency.src.ExampleThread.out.production.ExampleThread.BankingExcercise.part3AtomicAndVolatile.Atomic;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

public class Main {
    public static void main(String[] args) {
        /**
         * AS i udnerstand Atmoic allows for some really low-level operations to be performed
         * using specialised machine INstructions to manipulate the data i.e compare and set
         */

        AtomicLong nextNumber= new AtomicLong();
        long id = nextNumber.incrementAndGet();

        var adder = new LongAdder();
        adder.increment();
    }
}
