package tCPDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) throws IOException {
        //发送数据
        String ip = InetAddress.getLocalHost().getHostAddress();
        //String ip2 = InetAddress.getByName("LW-PC").getHostAddress();
        //System.out.println(ip.equals(ip2));
        Socket s = new Socket("192.168.56.1", 9999);

        OutputStream os = s.getOutputStream();
        os.write("vxv第三方神鼎飞丹砂第三方师傅".getBytes(StandardCharsets.UTF_8));
      //os.flush();

        //接受反馈
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String str = new String(bytes,0, len);
        System.out.println("Client" + str);

        s.close();
    }
}
