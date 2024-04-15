package worksheet07DesignPattern.SIngletonThreadSafe;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        SingletonThread threadsafe = SingletonThread.getInstance();

        int x = 1;
        int y = 2;
        int res = threadsafe.operation(1 , 2,(j,m) -> j +m  );
        String user = threadsafe.operation("jim", "bob", (j , k) -> j + " " + k);
        System.out.println("hello");
        System.out.println(res + " " + user);
        Thread runnable = new Thread( () -> {
                SingletonThread thread = SingletonThread.getInstance();
                String message = thread == threadsafe ?   "same instance" : "not the same";
                System.out.println(message);
        });
        Thread[] threads = new Thread[10];
        for (int i = 0; i <threads.length ; i++) {
            threads[i] = new Thread(runnable);
            threads[i].start();
        }
        for(Thread thread : threads ){
            thread.join();
        }
    }
}
