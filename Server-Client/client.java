import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class client {
    public class server {
    public static void main(String[] args) throws IOException{
        Socket socket=new Socket("localhost",5000);
        System.out.println("Connected to server.");

        BufferedReader in =new BufferedReader(new InputStreamReader(socket.getInputStream()));

        PrintWriter out=new PrintWriter(socket.getOutputStream(),true);

        out.println("Hello From Client.");

        String response=in.readLine();
        System.out.println("Recieved from Server: "+ response);

        in.close();
        out.close();
        socket.close();
    }    
}
}
