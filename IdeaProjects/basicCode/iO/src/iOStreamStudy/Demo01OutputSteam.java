package IOStreamStudy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
 * IO流的分类：
 * 		流向：
 * 			输入流	读取数据
 * 			输出流 写出数据
 * 		数据类型：
 * 			字节流
 * 				字节输入流	读取数据	InputStream
 * 				字节输出流	写出数据	OutputStream
 * 			字符流
 * 				字符输入流	读取数据	Reader
 * 				字符输出流	写出数据	Writer
 *
 * 		注意：一般我们在探讨IO流的时候，如果没有明确说明按哪种分类来说，默认情况下是按照数据类型来分的。
 *
 * 需求：我要往一个文本文件中输入一句话："hello,io"
 *
 * 分析：
 * 		A:这个操作最好是采用字符流来做，但是呢，字符流是在字节流之后才出现的，所以，今天我先讲解字节流如何操作。
 * 		B:由于我是要往文件中写一句话，所以我们要采用字节输出流。
 *
 * 通过上面的分析后我们知道要使用：OutputStream
 * 但是通过查看API，我们发现该流对象是一个抽象类，不能实例化。
 * 所以，我们要找一个具体的子类。
 * 而我们要找的子类是什么名字的呢?这个时候，很简单，我们回想一下，我们是不是要往文件中写东西。
 * 文件是哪个单词：File
 * 然后用的是字节输出流，联起来就是：FileOutputStream
 * 注意：每种基类的子类都是以父类名作为后缀名。
 * 		XxxOutputStream
 * 		XxxInputStream
 * 		XxxReader
 * 		XxxWriter
 * 查看FileOutputStream的构造方法：
 * 		FileOutputStream(File file)
 *		FileOutputStream(String name)
 *
 * 字节输出流操作步骤：
 * 		A:创建字节输出流对象
 * 		B:写数据
 * 		C:释放资源
 */
public class Demo01OutputSteam {
    public static void main(String[] args) throws IOException {
       // File file = new File("D:\\Java");
        FileOutputStream  fileOutputStream = new FileOutputStream("test.txt");
        fileOutputStream.write("Hello,IO".getBytes(StandardCharsets.UTF_8));
        File file = new File("test.txt");
        fileOutputStream.close();
        System.out.println(file.delete());
    }
}
