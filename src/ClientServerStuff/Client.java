package ClientServerStuff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws IOException {

        if(args.length != 2 ){
            System.err.println(
                    "Bad port and/or bad host Client <hostname> <port>");

        }
        String hostName = args[0];
        int portnum = Integer.parseInt(args[1]);
        try(
                Socket reply = new Socket(hostName, portnum);
                PrintWriter someguy = new PrintWriter(reply.getOutputStream(), true);
                BufferedReader anotherguy = new BufferedReader(
                        new InputStreamReader(reply.getInputStream()))
                ){
               BufferedReader standardInputOutput =
                       new BufferedReader( new InputStreamReader(System.in));
               String message;
               while((message = standardInputOutput.readLine()) != null){
                   someguy.println(message);
                   System.out.println("reply back" + " " + anotherguy.readLine());
                   if(message.equals("goodbye")){
                       break;
                   }
               }
        }
        catch (UnknownHostException e){
            System.err.println("bad host :" + hostName);
        }
        catch(IOException e){
            System.err.println("no IO available connection works though " + hostName);
            System.exit(1);
        }

    }


    }


