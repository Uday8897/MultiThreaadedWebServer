import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public static void run() throws IOException{
        int port=8010;
        ServerSocket server=new ServerSocket(port);
        server.setSoTimeout(10000);
        while (true) {
            Socket clientConnected=server.accept();
            System.out.println("Cleint conneced");
            PrintWriter servWriter=new PrintWriter(clientConnected.getOutputStream(),true);
            BufferedReader reader=new BufferedReader(new InputStreamReader(clientConnected.getInputStream()));
            servWriter.println("This  is From Single Threaded WebServer");
             System.out.println(reader.readLine());
             servWriter.close();
             reader.close();
             clientConnected.close();
             
        }
    }
 public static void main(String[] args) {
    Server ser=new Server();
    try {
        ser.run();
    } catch (IOException e) {
        e.printStackTrace();
    }
 }   
}