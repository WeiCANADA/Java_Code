package IOStreamStudy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04FisAndFos {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        FileOutputStream fos = new FileOutputStream("fosTest.txt" , true);

        //读取并输出
       /* int by = fis.read();
        while( by != -1 ){
            System.out.print((char) by);
            by = fis.read();
        }*/
        //循环改进
        /*int len = 0;
        while ((len = fis.read()) != -1){
            System.out.print((char)len);
        }*/

        //复制文件
        byte[] by = new byte[1024];
        int len;
        //读取,赋值,判断
        while((len = fis.read(by)) != -1){
            fos.write(by,0,len);
        }
        fos.close();
        fis.close();
    }
}
