package SocketTcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPechoServer {
public final static int serverport =9999;
public static void main(String[] args) {
    try {
         ServerSocket ss =new ServerSocket(serverport);
         System.out.println("Server đã được tạo");
         while (true) {
            try {
                Socket s =ss.accept();
                OutputStream os = s.getOutputStream();
                InputStream is= s.getInputStream();
                int ch =0;
                while (true) {
                        ch = is.read();
                        if(ch == 1) break;
                            System.out.println((char)ch);
                            os.write(ch);
                }
                s.close();
                        
                    
                
            } catch (Exception ie1) {
                     System.out.println("Connect Error:"+ie1);

            }
            
         }
    } catch (Exception e) {
                     System.out.println("Server Creation Error:"+e);
    }
}
    
}
