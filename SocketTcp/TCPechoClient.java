package SocketTcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPechoClient {
public final static String serverIP ="localhost";
public final static int port = 9999;
public static void main(String[] args) throws InterruptedException,IOException {
    Socket s = null;
    try {
        s = new Socket(serverIP,port);
        System.out.println("Client đã được tạo");
        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();
        for(int i=0;i<10;i++){
            os.write(i);
            int ch = is.read();
            System.out.println((char)ch);
            Thread.sleep(3000);
        }
    } catch (Exception e) {
        System.out.println("Error: Can't Create Soket"+e);
     }
     finally{
        if(s != null){

            s.close();
        }
     }
}




}