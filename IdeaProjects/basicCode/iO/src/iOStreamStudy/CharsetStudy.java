package IOStreamStudy;
/*
*1.   String(byte[] bytes)
          通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String。
 2.String(byte[] bytes, Charset charset)
          通过使用指定的 charset 解码指定的 byte 数组，构造一个新的 String。
          *
 3. pulic byte[] getBytes()使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
 *
 * 4.public byte[] getBytes(Charset charset)使用给定的 charset 将此 String 编码到 byte 序列，并将结果存储到新的 byte 数组。
* */

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharsetStudy {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "你好";

        //String ---> byte[]
        //byte[] bys = s.getBytes();//[-28, -67, -96, -27, -91, -67]
        //byte[] bys = s.getBytes("GBK");//[-60, -29, -70, -61]
        byte[] bys = s.getBytes("utf-8");//[-28, -67, -96, -27, -91, -67]

        System.out.println(Arrays.toString(bys));

        //byte[] --->String
        //String ss = new String(bys);//你好
        String ss = new String(bys,"GBK");//浣犲ソ

        System.out.println(ss);

    }
}
