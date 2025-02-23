import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public void run() throws UnknownHostException, IOException {
        InetAddress add = InetAddress.getByName("localhost");
        int port = 8010;
        Socket client = new Socket(add, port);
        System.out.println("Client connected to Server");
        PrintWriter clientWriter = new PrintWriter(client.getOutputStream(), true);
        BufferedReader clientReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
        clientWriter.println("Hey Errizuk this is from Client");
        System.out.println(clientReader.readLine());
        clientWriter.close();
        clientReader.close();
        client.close();

    }

    public static void main(String[] args) {
        Client client = new Client();
        try {

            client.run();
        } catch (Exception e) {
            // System.out.println();
            e.printStackTrace();
        }
    }
}