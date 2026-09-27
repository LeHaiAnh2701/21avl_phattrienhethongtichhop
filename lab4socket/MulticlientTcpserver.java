package lab4socket;

import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MulticlientTcpserver {
    private static final int PORT = 5000;
    private static int max_clients= 20;
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(max_clients);
        try(ServerSocket server = new ServerSocket(PORT)){
              System.out.println("Multi-client server on port "+PORT);


        }
    }
}
