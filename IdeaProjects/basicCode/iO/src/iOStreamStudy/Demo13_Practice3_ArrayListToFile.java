package IOStreamStudy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 需求：把ArrayList集合中的字符串数据存储到文本文件
 *
 * 分析：
 * 		通过题目的意思我们可以知道如下的一些内容，
 * 			ArrayList集合里存储的是字符串。
 * 			遍历ArrayList集合，把数据获取到。
 * 			然后存储到文本文件中。
 * 			文本文件说明使用字符流。
 *
 * 数据源：
 * 		ArrayList<String> -- 遍历得到每一个字符串数据
 * 目的地：
 * 		a.txt -- FileWriter -- BufferedWriter
 */
public class Demo13_Practice3_ArrayListToFile {
    public static void main(String[] args) throws IOException {
        //创建ArrayList String 集合
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Hello");
        stringArrayList.add("World");
        stringArrayList.add("Java");

        //创建目标File
        //FileWriter fw = new FileWriter("a.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));

        //遍历数组并写入
/*        for (int i = 0; i < stringArrayList.size(); i++) {
            String str = stringArrayList.get(i);
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
        bw.close();*/
        for (String str : stringArrayList) {
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
        bw.close();


    }
}
