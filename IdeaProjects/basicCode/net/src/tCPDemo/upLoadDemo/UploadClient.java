package tCPDemo.upLoadDemo;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class UploadClient {
    public static void main(String[] args) throws IOException {
        String iP = InetAddress.getByName("LW-PC").getHostAddress();
        Socket s = new Socket(iP, 33333);


        //读取src
        BufferedReader br = new BufferedReader(new FileReader("D:\\Java\\IdeaProjects\\IO-Code\\printWriter"));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line ;
        while (( line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        ////Socket提供了一个终止，它会通知服务器你别等了，我没有数据过来了
        s.shutdownOutput();
        //接受反馈
        BufferedReader brService = new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println(brService.readLine());
            bw.newLine();
            bw.flush();

        br.close();
        s.close();

    }
}
