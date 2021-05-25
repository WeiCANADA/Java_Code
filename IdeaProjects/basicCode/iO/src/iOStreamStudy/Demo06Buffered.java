package IOStreamStudy;
/*
 * 1.public class BufferedInputStream and public class BufferedOutputStream
 * 2.四种读写方法速度的比较
 *  需求：把e:\\哥有老婆.mp4复制到当前项目目录下的copy.mp4中
 *
 * 字节流四种方式复制文件：
 * 基本字节流一次读写一个字节：	共耗时：99503毫秒
 * 基本字节流一次读写一个字节数组： 共耗时：167毫秒
 * 高效字节流一次读写一个字节： 共耗时：592毫秒
 * 高效字节流一次读写一个字节数组： 共耗时：32毫秒
 *
 * */

import java.io.*;

public class Demo06Buffered {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
//        method1("D:\\20.28_IO流(字节流四种方式复制MP4并测试效率).avi", "copyAvi1");
//        method2("D:\\20.28_IO流(字节流四种方式复制MP4并测试效率).avi", "copyAvi2");
//        method3("D:\\20.28_IO流(字节流四种方式复制MP4并测试效率).avi", "copyAvi3");
        method4("D:\\20.28_IO流(字节流四种方式复制MP4并测试效率).avi", "copyAvi4");

        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(time);
    }

    //基本字节流一次读写一个字节
    private static void method1(String srcString, String destString) throws IOException {
        FileInputStream fis = new FileInputStream(srcString);
        FileOutputStream fos = new FileOutputStream(destString);

        int i = 0;
        while ((i = fis.read()) != -1) {
            fos.write(i);
        }
    }

    //    基本字节流一次读写一个字节
    private static void method2(String srcString, String destString) throws IOException {
        FileInputStream fis = new FileInputStream(srcString);
        FileOutputStream fos = new FileOutputStream(destString);

        int len = 0;
        byte[] bys = new byte[1024];
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
    }

    //高效字节流一次读写一个字节
    private static void method3(String srcString, String destString) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcString));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destString));

        int i = 0;
        while ((i = bis.read()) != -1) {
            bos.write(i);
        }
    }

    //高效字节流一次读写一个字节数组
    private static void method4(String srcString, String destString) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcString));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destString));

        int len = 0;
        byte[] bys = new byte[1048576];
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys,0 , len);
        }
    }
}
