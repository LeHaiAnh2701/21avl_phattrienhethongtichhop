package lab4socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;

public class UDPechoserver{
private static final int PORT = 5001;
public static void main(String[] args) {
    byte[] buffer = new byte[4096];
    try(DatagramSocket socket = new DatagramSocket(PORT)) {
        System.out.println("UDP server listening on port"+ PORT);
        while (true) {
            DatagramPacket request = new DatagramPacket(buffer,buffer.length);
            socket.receive(request);
            String message = new String(request.getData(),
            request.getOffset(),request.getLength(),StandardCharsets.UTF_8);
              
            String text = "ACK"+message.toUpperCase();
            byte[] responseData = text.getBytes(StandardCharsets.UTF_8);

            DatagramPacket response = new DatagramPacket(
              responseData,responseData.length,
              request.getAddress(),request.getPort());
            socket.send(response);
            
        }




    } catch (Exception e) {
System.out.println("UDP server error" +e.getMessage());    }
}


}