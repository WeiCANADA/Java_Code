package IOStreamStudy.sequenceStream;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class Demo02SequenceStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream1 = new FileInputStream("a.txt");
        FileInputStream fileInputStream2 = new FileInputStream("b.txt");
        FileInputStream fileInputStream3 = new FileInputStream("c.txt");



        //public SequenceInputStream(Enumeration<? extends InputStream> e)
        Vector<InputStream> streamVector = new Vector<>();
        streamVector.add(fileInputStream1);
        streamVector.add(fileInputStream2);
        streamVector.add(fileInputStream3);
        Enumeration<InputStream> inputStreamEnumeration = streamVector.elements();
        SequenceInputStream sequenceInputStream = new SequenceInputStream(inputStreamEnumeration);

        //封装目的地
        FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");

        //写入
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = sequenceInputStream.read(bytes)) != -1){
            fileOutputStream.write(bytes, 0, len);
        }
        fileOutputStream.close();
        sequenceInputStream.close();
    }
}
