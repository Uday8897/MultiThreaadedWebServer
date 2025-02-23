import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int port = 8010;
        try (ServerSocket serverSocket = new ServerSocket(port)) { 
            System.out.println("Server started on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept(); 

                Thread thread = new Thread(() -> {
                    try (PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)) {
                        writer.println(
                                "This is a multi-threaded web server. Thread: " + Thread.currentThread().getName());
                        System.out.println(
                                new BufferedReader(new InputStreamReader(clientSocket.getInputStream())).readLine());
                        System.out.println(clientSocket.getInetAddress().getHostAddress());
                        clientSocket.close();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
