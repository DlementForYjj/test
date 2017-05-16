package test.net.proxy;

import java.net.ServerSocket;  
import java.net.Socket;  
  
public class SocketProxy {  
    /** 
     * @param args 
     */  
    public static void main(String[] args) throws Exception {  
        ServerSocket serverSocket = new ServerSocket(8080);  
        while (true) {  
            Socket socket = null;  
            try {  
                socket = serverSocket.accept();  
                new SocketThread(socket).start();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
    }  
}  