package IOStreamStudy.propoties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * 我有一个文本文件(Names.txt)，我知道数据是键值对形式的，但是不知道内容是什么。
 * 请写一个程序判断是否有“list”这样的键存在，如果有就改变其实为”100”
 *
 * 分析：
 * 		A:把文件中的数据加载到集合中
 * 		B:遍历集合，获取得到每一个键
 * 		C:判断键是否有为"list"的，如果有就修改其值为"100"
 * 		D:把集合中的数据重新存储到文件中
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        //// 把文件中的数据加载到集合中
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("Names.txt");
        properties.load(fileReader);
        fileReader.close();

        // 遍历集合，获取得到每一个键
        Set<String> keys = properties.stringPropertyNames();
        for(String key :keys){
            if("list".equals(key)){
                properties.setProperty("list","100");
                break;
            }
        }
        // 把集合中的数据重新存储到文件中
        FileWriter fileWriter = new FileWriter("Names.txt");
        properties.store(fileWriter, "null");
        fileWriter.close();
    }
}
