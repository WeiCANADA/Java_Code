package IOStreamStudy;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字节输出流操作步骤：
 * A:创建字节输出流对象
 * B:调用write()方法
 * C:释放资源
 *
 * public void write(int b):写一个字节
 * public void write(byte[] b):写一个字节数组
 * public void write(byte[] b,int off,int len):写一个字节数组的一部分
 */
public class Demo02Methods {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
        fileOutputStream.write(97);
        byte[] bytes = new byte[] {45,97,98,99,100};
        fileOutputStream.write(bytes);
        fileOutputStream.write("\r\n".getBytes());
        fileOutputStream.write(bytes, 2, 2);//bc
        fileOutputStream.close();

    }
}
