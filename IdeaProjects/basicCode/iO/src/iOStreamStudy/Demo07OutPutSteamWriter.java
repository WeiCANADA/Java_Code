package IOStreamStudy;
/*
1.structures
* OutputStreamWriter(OutputStream out)
          创建使用默认字符编码的 OutputStreamWriter。
OutputStreamWriter(OutputStream out, Charset cs)
          创建使用给定字符集的 OutputStreamWriter。
          *
  2.Methods
  write(String str)
          写入字符串。
   getEncoding()
          返回此流使用的字符编码的名称。
 void write(char[] cbuf)
          写入字符数组的某一部分。
 void write(int c)
          写入单个字符。
 void write(String str, int off, int len)
          写入字符串的某一部分。


* */
import java.io.*;

public class Demo07OutPutSteamWriter {
    public static void main(String[] args) throws IOException {

        //public class OutputStreamWriter

        //OutputStreamWriter(OutputStream out)
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));
        //OutputStreamWriter(OutputStream out, Charset cs)
      // OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("osw.txt",true), "utf-8");

        //write(String str)
        osw.write("中国");
       // osw1.write("中国人!");
        osw.write("中国人!!");

        //write(int c)
        osw.write(97);

        //write(char[] cbuf)
        char[] chars = new char[]{'a', 'b', 'c'};
        osw.write(chars);

        //write(String str, int off, int len)
        String str = "刘刘思坦";
        osw.write(str, 1, 3);

        //osw.flush();//刷新缓冲区
        osw.close();//刷新缓冲区,再关闭流
       //osw1.close();
    }
}
