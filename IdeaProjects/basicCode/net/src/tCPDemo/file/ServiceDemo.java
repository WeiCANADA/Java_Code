package tCPDemo.file;
/*
* 写入txt 文本demo
* */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServiceDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(22222);
        System.out.println("Service is running....");

        Socket s = ss.accept();

        InputStreamReader isr =new InputStreamReader( s.getInputStream());
        BufferedReader br = new BufferedReader(isr);
        //封装目标文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("Client.txt"));
        //写入
        String line;
             while ((line = br.readLine()) != null){
                 bw.write(line);
                 bw.newLine();
                 bw.flush();
             }
             bw.close();
             s.close();
    }
}
