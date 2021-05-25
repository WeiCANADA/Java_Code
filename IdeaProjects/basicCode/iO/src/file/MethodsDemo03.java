package file;

import java.io.File;
import java.io.IOException;

public class MethodsDemo03 {
    public static void main(String[] args) throws IOException {

        File f2 = new File("IO-Code\\java.txt");
        System.out.println(f2.createNewFile());
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.getPath());
        System.out.println(f2.delete());

        File f1 = new File("java.txt");
        System.out.println(f1.createNewFile());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.delete());
    }
}
