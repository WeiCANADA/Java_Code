package IOStreamStudy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Demo03Exception {
    public static void main(String[] args) {
       /* FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("text.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fos.write("Hello,IO".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("test.txt");
        fos.write("Hello,IO".getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //如果fos不是null,才需要close()
            if (fos != null) {
                //为了保证close()一定会执行,就放在这里.
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
