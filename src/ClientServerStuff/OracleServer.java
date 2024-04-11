package ClientServerStuff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class OracleServer {
    public static void main(String[] args) throws IOException {

        if(args.length != 1){
            System.err.println("Bad Port:  OracleServer <port>");
            System.exit(1);
        }
        int portnumber = Integer.parseInt(args[0]);

        try {
            ServerSocket serverSock = new ServerSocket(portnumber);
            while(true){
                Socket clientSocket = serverSock.accept();

                Thread.ofVirtual().start(() -> {
                    try(
                            PrintWriter thingy = new PrintWriter(clientSocket.getOutputStream(), true);
                            BufferedReader anotherthingy = new BufferedReader(
                                    new InputStreamReader(clientSocket.getInputStream()));
                            ) {
                        String message;
                        while( (message = anotherthingy.readLine() ) != null){
                            System.out.println(message);
                            thingy.println(message);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            }
        }catch(IOException e){
            System.out.println("an error happened tryng to connect on" + " " + portnumber);
            e.printStackTrace();
        }
    }

}
