package file;

import java.io.File;
import java.sql.SQLOutput;

public class ConstructorsDemo01 {
    public static void main(String[] args) {

        //Constructors

        //File(String pathname)
        //Creates a new File instance by converting the given pathname string into an abstract pathname.
        File f1 = new File("D:\\Java\\test\\text.txt");
        System.out.println(f1);

        //File(File parent, String child)
        //Creates a new File instance from a parent abstract pathname and a child pathname string.
        File f2 = new File("D:\\Java\\test", "text.txt");
        System.out.println(f2);

        //File (String parent, String child)
        //Creates a new File instance from a parent pathname string and a child pathname string.
        File f3 = new File("D:\\Java\\test");
        File f4 = new File(f3, "text.txt");
        System.out.println(f4);


    }
}
