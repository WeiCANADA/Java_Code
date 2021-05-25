package IOStreamStudy;

import java.io.*;

/*
 * 复制文本文件
 * */
public class Demo11Practice1 {
    public static void main(String[] args) throws IOException {
        method1("C:\\a.txt", "copy1.txt");
        method2("C:\\a.txt", "copy2.txt");
        method3("C:\\a.txt", "copy3.txt");
        method4("C:\\a.txt", "copy4.txt");
        method5("C:\\a.txt", "copy5.txt");
    }

    // 基本字符流一次读写一个字符
    private static void method2(String srcString, String destString) throws IOException {
        FileReader fr = new FileReader(srcString);
        FileWriter fw = new FileWriter(destString);
        int i;
        while ((i = fr.read()) != -1) {
            fw.write(i);
        }
        fr.close();
        fw.close();
    }

    // 基本字符流一次读写一个字符数组
    private static void method3(String srcString, String destString) throws IOException {
        FileReader fr = new FileReader(srcString);
        FileWriter fw = new FileWriter(destString);
        int len = 0;
        char[] chars = new char[1024];
        while ((len = fr.read(chars)) != -1) {
            fw.write(chars, 0, len);
        }
        fr.close();
        fw.close();
    }

    //  字符缓冲流一次读写一个字符
    private static void method4(String srcString, String destString) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(srcString));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destString));
        int i = 0;
        while ((i = br.read()) != -1) {
            bw.write(i);
        }
        br.close();
        bw.close();
    }

    //字符缓冲流一次读写一个字符数组
    private static void method5(String srcString, String destString) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(srcString));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destString));
        int len = 0;
        char[] chars = new char[1024];
        while ((len = br.read(chars)) != -1) {
            bw.write(chars, 0, len);
        }
        br.close();
        bw.close();
    }


    //  字符缓冲流一次读写一个字符串
    private static void method1(String srcString, String destString) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(srcString));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destString));
        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
