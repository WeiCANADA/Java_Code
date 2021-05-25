package IOStreamStudy.randomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 随机访问流：
 * 		RandomAccessFile类不属于流，是Object类的子类。
 * 		但它融合了InputStream和OutputStream的功能。
 * 		支持对文件的随机访问读取和写入。
 *
 * public RandomAccessFile(String name,String mode)：第一个参数是文件路径，第二个参数是操作文件的模式。
 * 		模式有四种，我们最常用的一种叫"rw",这种方式表示我既可以写数据，也可以读取数据
 */
public class Demo01RandomAccessFile {
    public static void main(String[] args) throws IOException {
        write();
        read();

    }

    private static void read() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("randomAccessFile.txt", "rw");
        //int i = randomAccessFile.read();
        //System.out.println(i + "文件指针:" + randomAccessFile.getFilePointer());
        byte b = randomAccessFile.readByte();
        System.out.println(b + "文件指针:" + randomAccessFile.getFilePointer());
        int i1 = randomAccessFile.readInt();
        System.out.println(i1 + "文件指针:" + randomAccessFile.getFilePointer());
        String str = randomAccessFile.readUTF();
        System.out.println(str + "文件指针:" + randomAccessFile.getFilePointer());





    }

    private static void write() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("randomAccessFile.txt", "rw");
        //randomAccessFile.write(100);
        randomAccessFile.writeByte(1);
        randomAccessFile.writeInt(100);
        //randomAccessFile.writeChars("liusitan");
        randomAccessFile.writeUTF("刘曦冉");
        randomAccessFile.close();

    }
}
