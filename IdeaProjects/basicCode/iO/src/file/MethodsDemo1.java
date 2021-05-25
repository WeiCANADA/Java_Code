package file;

import java.io.File;
import java.io.IOException;

public class MethodsDemo1 {
    public static void main(String[] args) throws IOException {

        //Methods

        //public boolean createNewFile()
        File f1 = new File("D://Java//mkdir//javatest.txt");
        //System.out.println(f1.createNewFile());//The system cannot find the path specified

        //public boolean mkdir()  Creates the directory named by this abstract pathname.
        File f2 = new File("D://Java//mkdirTest1");
        File f3 = new File("D://Java//mkdirTest2");
        //System.out.println(f2.mkdir());//true
        //System.out.println(f3.mkdir());//true
        System.out.println(f2.createNewFile());//true
        System.out.println(f3.createNewFile());//true

        /*
       public boolean mkdirs()
       Creates the directory named by this abstract pathname,
        including any necessary but nonexistent parent directories.
       Note that if this operation fails it may have succeeded in creating some of the necessary parent directories.
//       */
        File f4 = new File(f2,"mkdirsTest//test1");
        //System.out.println(f3.mkdirs());//true
    }
}
