package IOStreamStudy.objectStream;
/*
 * 序列化流：把对象按照流一样的方式存入文本文件或者在网络中传输。对象 -- 流数据(ObjectOutputStream)
 * 反序列化流:把文本文件中的流对象数据或者网络中的流对象数据还原成对象。流数据 -- 对象(ObjectInputStream)
 */
import java.io.*;

public class Demo01ObjectStream {

    //private static Object Person;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
       // write();
        readObject();


    }

    private static void readObject() throws IOException, ClassNotFoundException {
        //创建反序列化对象
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.txt"));
        //还原对象
        Object obj = objectInputStream.readObject();
        //释放资源
        objectInputStream.close();
        //输出对象
        System.out.println(obj);
    }

    private static void write() throws IOException {
        //创建序列化对象
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.txt"));
        //创建一个对象
        Person person = new Person("张三丰", "299");
        //序列化对象
        objectOutputStream.writeObject(person);
        //释放资源
        objectOutputStream.close();
    }
}
