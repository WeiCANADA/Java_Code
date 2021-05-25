package tCPDemo.buffered;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        String ip = InetAddress.getLocalHost().getHostAddress();

        Socket s = new Socket(ip,22222);
        //String string = "Buffered test";
        //input keyboard
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        System.out.println("请输入要发送的内容:");
        Scanner sc = new Scanner(System.in);
        String line ;
        while ((line = sc.nextLine()) != null){
            //键盘录入数据要自定义结束标记
            if(line.equals("886")){
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        System.out.println("与服务器断开");
        s.close();
    }
}
