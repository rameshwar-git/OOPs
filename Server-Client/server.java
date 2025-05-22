
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket=new ServerSocket(5000);
        System.out.println("Wating for server.");

        Socket socket=serverSocket.accept();
        System.out.println("Client Connected.");
        BufferedReader in =new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out=new PrintWriter(socket.getOutputStream(),true);

        String message=in.readLine();
        System.out.println("Recieved from Client: "+ message);

        out.println("Hello From Server.");

        in.close();
        out.close();
        socket.close();
        serverSocket.close();
    }    
}
