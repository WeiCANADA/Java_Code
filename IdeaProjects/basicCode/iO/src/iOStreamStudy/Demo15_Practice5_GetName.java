package IOStreamStudy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * 需求：我有一个文本文件中存储了几个名称，请大家写一个程序实现随机获取一个人的名字。
 *
 * 分析：
 * 		A:把文本文件中的数据存储到集合中
 * 		B:随机产生一个索引
 * 		C:根据该索引获取一个值
 */
public class Demo15_Practice5_GetName {
    public static void main(String[] args) throws IOException {
        //把文本文件读取存储到集合
        BufferedReader br = new BufferedReader(new FileReader("d:\\names.txt"));
        ArrayList<String> strings = new ArrayList<>();

        String line = null;
        while ((line = br.readLine()) != null){
            strings.add(line);
        }

        //随机获取索引
        Random random = new Random();
       int index = random.nextInt(strings.size());
       //根据索引获取一个值
       String randomName = strings.get(index);
        System.out.println(randomName);
    }
}
