package tCPDemo.upLoadDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadService {
    public static void main(String[] args) throws IOException {
        //侦听port
        ServerSocket ss = new ServerSocket(33333);
        System.out.println("UploadService is running.....");
        Socket s = ss.accept();

        //接受数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String rIP = s.getRemoteSocketAddress().toString();


        //封装目标文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("TCP_CopyDemo.txt"));
        String line ;
        while ((line = br.readLine())!= null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //给出反馈
        BufferedWriter bwService = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwService.write(rIP + "/t" +"File uploaded successfully!");
        bwService.newLine();
        bwService.flush();

        //释放资源
        bw.close();
        s.close();


    }
}
