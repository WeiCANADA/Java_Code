package IOStreamStudy;
/*
* 由于我们常见的操作都是使用本地默认编码，所以，不用指定编码。
 * 而转换流的名称有点长，所以，Java就提供了其子类供我们使用。
 * OutputStreamWriter = FileOutputStream + 编码表(GBK)
 * FileWriter = FileOutputStream + 编码表(GBK)
 *
 * InputStreamReader = FileInputStream + 编码表(GBK)
 * FileReader = FileInputStream + 编码表(GBK)
 *
 /*
 * 需求：把当前项目目录下的a.txt内容复制到当前项目目录下的b.txt中
 *
 * 数据源：
 * 		a.txt -- 读取数据 -- 字符转换流 -- InputStreamReader -- FileReader
 * 目的地：
 * 		b.txt -- 写出数据 -- 字符转换流 -- OutputStreamWriter -- FileWriter
 * 需求：把c:\\a.txt内容复制到d:\\b.txt中
 *
 * 数据源：
 * 		c:\\a.txt -- FileReader
 * 目的地:
 * 		d:\\b.txt -- FileWriter
 */
import java.io.*;

//复制文件
public class Demo09ReaderAndWriter {
    public static void main(String[] args) throws IOException {
        //封装数据源
        //FileReader fr = new FileReader("osw.txt");
        BufferedReader br = new BufferedReader(new FileReader("osw.txt"));

        //封装目的地
       // FileWriter fw = new FileWriter("copyOsw.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter("copyOsw.txt",true
        ));

      /*  int ch = 0;
        //byte by = 0;
        while ((ch = fr.read()) != -1){
            fw.write(ch);
        }*/

        char[] chars = new char[1024];
        int len = 0;
        /*while ((len = fr.read(chars)) != -1){
            fw.write(chars, 0, len);
        }*/

        while((len = br.read(chars)) != -1){
            bw.write(chars, 0, len);
        }

        //fr.close();
        br.close();
        //fw.close();
        bw.close();
    }
}
