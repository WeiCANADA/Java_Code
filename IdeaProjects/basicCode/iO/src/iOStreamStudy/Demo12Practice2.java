package IOStreamStudy;

import java.io.*;

/*
 * 复制图片
 *
 * 分析：
 * 		复制数据，如果我们知道用记事本打开并能够读懂，就用字符流，否则用字节流。
 * 		通过该原理，我们知道我们应该采用字节流。
 * 		而字节流有4种方式，所以做这个题目我们有4种方式。推荐掌握第4种。
 *
 * 数据源：
 * 		c:\\yd.jpg -- FileInputStream -- BufferedInputStream
 * 目的地：
 * 		d:\\yd.jpg -- FileOutputStream -- BufferedOutputStream
 */
public class Demo12Practice2 {
    public static void main(String[] args) throws IOException {
        //使用字符串作为路径
        //String srcString = "";
        //String destString = "c:\\c:\\yd.jpgyd.jpg";
        //使用File对象作为参数
        File srcFile = new File("c:\\yd.jpg");
        File destFile1 = new File("d:\\yd1.jpg");
        File destFile2 = new File("d:\\yd2.jpg");
        File destFile3 = new File("d:\\yd3.jpg");
        File destFile4 = new File("d:\\yd4.jpg");
        method1(srcFile, destFile1);
        method2(srcFile, destFile2);
        method3(srcFile, destFile3);
        method4(srcFile, destFile4);
    }

    // 字节缓冲流一次读写一个字节
    private static void method4(File srcFile, File destFile1) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile1));

        int by = 0;
        while ((by = bis.read()) != -1){
            bos.write(by);
        }
        bos.close();
        bis.close();
    }

    // 字节缓冲流一次读写一个字节数组
    private static void method3(File srcFile, File destFile2) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile2));

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes, 0, len);
        }
        bos.close();
        bis.close();
    }

    // 基本字节流一次读写一个字节数组
    private static void method2(File srcFile, File destFile3) throws IOException {
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile3);
         int len = 0;
         byte[] bytes = new byte[1024];
         while ((len = fis.read(bytes)) != -1){
             fos.write(bytes, 0, len);
         }
         fos.close();
         fis.close();
    }

    // 基本字节流一次读写一个字节
    private static void method1(File srcFile, File destFile4) throws IOException {
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile4);

        int by = 0;
        while ((by = fis.read()) != -1){
            fos.write(by);
        }
        fos.close();
        fis.close();
    }
}
