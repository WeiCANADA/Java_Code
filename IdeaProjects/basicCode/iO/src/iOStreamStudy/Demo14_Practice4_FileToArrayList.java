package IOStreamStudy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 需求：从文本文件中读取数据(每一行为一个字符串数据)到集合中，并遍历集合
 *
 * 分析：
 * 		通过题目的意思我们可以知道如下的一些内容，
 * 			数据源是一个文本文件。
 * 			目的地是一个集合。
 * 			而且元素是字符串。
 *
 * 数据源：
 * 		D:\Java\IdeaProjects\IO-Code\Demo_FileToArrayList -- FileReader -- BufferedReader
 * 目的地：
 * 		ArrayList<String>
 */
public class Demo14_Practice4_FileToArrayList {
    public static void main(String[] args) throws IOException {
        //封装数据源
        BufferedReader br = new BufferedReader(new FileReader("D:\\Java\\IdeaProjects\\IO-Code\\Demo_FileToArrayList"));
        //创建集合对象
        ArrayList<String> stringArrayList = new ArrayList<>();

        //读取数据并存储到集合
        String line = null;
        while ((line = br.readLine()) != null){
            stringArrayList.add(line);
        }
        br.close();

        //遍历集合
        for(String str : stringArrayList){
            System.out.println(str);
        }


    }
}
