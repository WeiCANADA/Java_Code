package IOStreamStudy;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo08InputSteamReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"));
        String isrEncoding = isr.getEncoding();
        System.out.println(isrEncoding);


        // i = isr.read();
        /*int i = 0;
        while ((i = isr.read()) != -1){
            System.out.print((char) i);
        }*/

        char[] chars = new char[1024];
        int len = 0;
        while ((len = isr.read(chars)) != -1){
            //System.out.print(Arrays.toString(chars));
            System.out.print(new String(chars,0, len));
        }
    }
}
