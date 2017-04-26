package test.net.soket;

import java.net.*;
import java.io.*;
 
public class GreetingClient
{
   public static void main(String [] args)
   {
      String serverName = "localhost";
      int port = Integer.parseInt("6666");
//      String clientMessage = "";
      
      try
      {
         System.out.println("Connnect to " + serverName+ " on port " + port);
         Socket client = new Socket(serverName, port);
         System.out.println("Client Connected: " + client.getRemoteSocketAddress());
         OutputStream outToServer = client.getOutputStream();
         DataOutputStream out =new DataOutputStream(outToServer);

         out.writeUTF("Client Message: Hello from "+ client.getLocalSocketAddress());
         InputStream inFromServer = client.getInputStream();
         DataInputStream in = new DataInputStream(inFromServer);
         System.out.println("Server response: " + in.readUTF());
         client.close();
      }catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}