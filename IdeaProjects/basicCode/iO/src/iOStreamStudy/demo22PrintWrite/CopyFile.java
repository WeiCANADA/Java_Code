package IOStreamStudy.demo22PrintWrite;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("printWriter"));
        PrintWriter printWriterCopy = new PrintWriter(new FileWriter("printWriterCopy"), true);
        String line = null;
        while((line = bufferedReader.readLine()) != null){
            printWriterCopy.println(line);
        }
        bufferedReader.close();
        printWriterCopy.close();
    }
}
