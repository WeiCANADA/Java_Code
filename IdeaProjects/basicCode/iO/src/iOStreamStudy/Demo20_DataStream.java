package IOStreamStudy;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.in;

/*
 * 可以读写基本数据类型的数据
 * 数据输入流：DataInputStream
 * 			DataInputStream(InputStream in)
 * 数据输出流：DataOutputStream
 * 			DataOutputStream(OutputStream out)
 */
public class Demo20_DataStream {
    public static void main(String[] args) throws IOException {
        write();
        read();
    }

    private static void read() throws IOException {
        //System.out.println("请输入一个数字");
        DataInputStream dis = new DataInputStream(new FileInputStream("dos.txt"));
        byte b = dis.readByte();
        boolean bl = dis.readBoolean();
        int i = dis.readInt();
        float f = dis.readFloat();
        long l = dis.readLong();
        double d = dis.readDouble();

        System.out.println(b);
        System.out.println(bl);
        System.out.println(i);
        System.out.println(f);
        System.out.println(l);
        System.out.println(d);


    }

    private static void write() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("dos.txt"));
        dos.writeByte(10);
        dos.writeBoolean(true);
        dos.writeInt(100);
        dos.writeFloat(10.23F);
        dos.writeLong(10000L);
        //dos.writeLong(10001L);
        dos.writeDouble(100000.22);
        dos.close();

    }
}
