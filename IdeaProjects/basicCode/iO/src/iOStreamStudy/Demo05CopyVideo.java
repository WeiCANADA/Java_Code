package IOStreamStudy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo05CopyVideo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\安装包\\传智播客2015黑马程序员之JAVA基础-深入浅出精华版" +
                "\\day20\\avi\\20.25_IO流(字节流复制视频案例2).avi");
        FileOutputStream fos = new FileOutputStream("20.25_IO流(字节流复制视频案例2).avi");

        byte[] bys = new byte[1024];
        int len = 0;
        while((len = fis.read(bys)) != -1){
            fos.write(bys,0,len);
        }

        fis.close();
        fis.close();
    }
}
