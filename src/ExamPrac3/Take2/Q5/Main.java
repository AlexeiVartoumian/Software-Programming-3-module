package ExamPrac3.Take2.Q5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        /*
        what is the expected output.
        Threads do not execute in sequence but the command .sequential() forces the threads
        to execute by order that they appear in the program.
         */
        Stream<Logger> s = Stream.of(
                new Logger("Warning"),
                new Logger("Error"),
                new Logger("DEbug")
        );
        ExecutorService es = Executors.newCachedThreadPool();
        s.sequential().forEach(l -> es.execute(l));
        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);

    }
}
