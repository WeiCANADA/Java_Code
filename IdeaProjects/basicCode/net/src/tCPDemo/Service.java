package tCPDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Service {
    public static void main(String[] args) throws IOException {
        //侦听port
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("Service is running .....");

        //接受数据
        Socket s = ss.accept();//阻塞
       // System.out.println("connected from " + s.getRemoteSocketAddress());
        //获取输入流
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String str = new String(bytes,0,len);
        System.out.println("Service :" + str);

        //反馈
        OutputStream os = s.getOutputStream();
        os.write( "data has received.".getBytes(StandardCharsets.UTF_8));
        //os.flush();
        s.close();
    }

}
