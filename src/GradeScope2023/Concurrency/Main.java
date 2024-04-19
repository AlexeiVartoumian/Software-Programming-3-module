package GradeScope2023.Concurrency;

public class Main {
    public static void main(String[] args) {


        PrintQueue queue = new PrintQueue();
        Thread client1 = new Thread (new Client(queue, "hello message 1")) ;
        Thread client2 = new Thread (new Client(queue, "intermediate 2"));
        Thread client3 = new Thread (new Client(queue, "goodbye message3"));

        Thread server = new Thread ( new PrintServer(queue));

        Thread[] clients = new Thread[4];
        clients[0] = client1;
        clients[1] = client2;
        clients[3] = client3;
        clients[2] = server;
        for (Thread client : clients) {
            client.start();
        }

    }
}
