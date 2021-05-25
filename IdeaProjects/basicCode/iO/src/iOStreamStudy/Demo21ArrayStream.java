package IOStreamStudy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
 * 内存操作流：用于处理临时存储信息的，程序结束，数据就从内存中消失。
 * 字节数组：
 * 		ByteArrayInputStream
 * 		ByteArrayOutputStream
 * 字符数组：
 * 		CharArrayReader
 * 		CharArrayWriter
 * 字符串：
 * 		StringReader
 * 		StringWriter
 */
public class Demo21ArrayStream {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //byteArrayOutputStream.write(100);
        byteArrayOutputStream.write(("hello java").getBytes(StandardCharsets.UTF_8));

        byte[] bytes = byteArrayOutputStream.toByteArray();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

        int by = 0;
        while ((by = byteArrayInputStream.read()) != -1){
            char cha = (char) by;
            System.out.print(cha);
        }
    }

}
