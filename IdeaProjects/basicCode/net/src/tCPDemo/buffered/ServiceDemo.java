package tCPDemo.buffered;
/*
* buffered 包装流
* */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServiceDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(22222);

        Socket s = ss.accept();

        InputStreamReader isr =new InputStreamReader( s.getInputStream());
        BufferedReader br = new BufferedReader(isr);
        String line;
             while ((line = br.readLine()) != null){
                 System.out.println(line);
             }
             s.close();
    }
}
