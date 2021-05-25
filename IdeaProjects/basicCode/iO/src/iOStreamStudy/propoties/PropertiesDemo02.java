package IOStreamStudy.propoties;
/*
 * 特殊功能：
 * public Object setProperty(String key,String value)：添加元素
 * public String getProperty(String key):获取元素
 * public Set<String> stringPropertyNames():获取所有的键的集合
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo02 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        //public Object setProperty(String key,String value)
        properties.setProperty("张三", "100岁");
        properties.setProperty("李四", "200岁");
        properties.setProperty("王五", "300岁");

        // public String getProperty(String key):获取元素
        String value = properties.getProperty("李四");
        System.out.println(value);

        //public Set<String> stringPropertyNames():获取所有的键的集合
        Set<String> strings = properties.stringPropertyNames();
        for (String str : strings) {
            System.out.println(str);
        }

        //public void store(Writer writer,String comments)throws IOException
        FileWriter fileWriter = new FileWriter("Names.txt");
        properties.store(fileWriter, "PropertiesTest");

        myLoad();

    }

    private static void myLoad() throws IOException {
        //public void load(Reader reader)throws IOException
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("Names.txt");
        properties.load(fileReader);
        fileReader.close();
        System.out.println("Properties" + properties);
    }
}
