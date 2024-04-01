package ExamPrac3.Q5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*
        Given the following class:

class Logger implements Runnable {
  String msg;

  public Logger(String msg) {
    this.msg = msg;
  }

  public void run() {
    System.out.print(msg);
  }
}
And given this code fragment:

Stream<Logger> s = Stream.of(
  new Logger("Error "),
  new Logger("Warning "),
  new Logger("Debug "));

ExecutorService es =
  Executors.newCachedThreadPool();

s.sequential().forEach(l -> es.execute(l));
es.shutdown();
es.awaitTermination(10, TimeUnit.SECONDS);
Assuming all import statements (not shown) are properly configured and that the code compiles, what are possible outputs and why?
         */
        Stream<Logger> s  = Stream.of(
                new Logger("Error"),
                new Logger("Warning"),
                new Logger("Debug")

        );
        ExecutorService es = Executors.newCachedThreadPool();
        s.forEach(l-> es.execute(l));
        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);

    }
}
