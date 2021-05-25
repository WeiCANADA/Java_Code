package IOStreamStudy.sequenceStream;

import java.io.*;

/*
* java.io
类 SequenceInputStream
*
* 构造方法:
*       public SequenceInputStream(Enumeration<? extends InputStream> e)
*       public SequenceInputStream(InputStream s1, InputStream s2)
* */
public class DemoSequenceStream {
    public static void main(String[] args) throws IOException {
        //FileReader fileReader1 = new FileReader("a.txt");
        //FileReader fileReader2 = new FileReader("b.txt");

        //包装源文件
        FileInputStream fileInputStream1 = new FileInputStream("a.txt");
        FileInputStream fileInputStream2 = new FileInputStream("b.txt");

        //包装目的地
        //PrintWriter printWriter = new PrintWriter("ab.txt");  省事 但发现一个问题到另一文档开头连接到前一个文档尾部
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ab.txt"));//同样有上面的问题
        //合并流
        //SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1, fileInputStream2);
        //字节流转为字符流 以便使用readLine
        //InputStreamReader inputStreamReader = new InputStreamReader(sequenceInputStream, "utf-8");
        //BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        //三合一
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader
                (new  SequenceInputStream(fileInputStream1, fileInputStream2), "utf-8"));

        //写入
       /* String line = null;
        while((line = bufferedReader.readLine()) != null){
            printWriter.println(line);
        }
        printWriter.close();*/
        String line = null;
        while((line = bufferedReader.readLine()) != null ){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
    }
}
