package IOStreamStudy;

import java.io.*;

/*
* public String readLine() 读取一个文本行。通过下列字符之一即可认为某行已终止：换行 ('\n')、回车 ('\r') 或回车后直接跟着换行。
* public void newLine() 写入一个行分隔符。行分隔符字符串由系统属性 line.separator 定义，并且不一定是单个新行 ('\n') 符。


 * */
public class Demo10BufferedReadLine {
    public static void main(String[] args) throws IOException {
        //封装数据源
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        //封装目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

        //读写数据
        String line = null;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
        }

        //释放资源
        bw.close();
        br.close();
    }

}
