import java.net.*;
import java.io.*; 
public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                try {
                    int port = 8010;
                    InetAddress ipAddr = InetAddress.getByName("localhost");
                    Socket socket = new Socket(ipAddr, port);
                    PrintWriter writer = new PrintWriter(socket.getOutputStream(), true); // added autoflush
                    BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    
                    writer.println("Hey Errizuk! This is from Client with Thread: " + Thread.currentThread().getName());

                    System.out.println("Server response: " + reader.readLine());
                    
                    reader.close();
                    writer.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            
            thread.start(); // start the thread after creation
        }
    }
}
