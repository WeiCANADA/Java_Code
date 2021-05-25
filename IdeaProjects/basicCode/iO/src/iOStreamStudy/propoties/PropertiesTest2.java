package IOStreamStudy.propoties;

import IOStreamStudy.iO_login_regist.guessNums.GuessNums;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {
    public static void main(String[] args) throws IOException {
        //创建可加载IO的Map集合 Properties
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("count.txt");
        properties.load(fileReader);
        fileReader.close();

        String value = properties.getProperty("count");
        int num = Integer.parseInt(value);
        System.out.println(num);

        if(num > 5){
            System.out.println("Game Over, insert coin please");
            System.exit(0);
        }else {
            num++;
            System.out.println(num);
            FileWriter fileWriter = new FileWriter("count.txt");
            properties.setProperty("count", String.valueOf(num));
            properties.store(fileWriter, null);
            fileReader.close();

            GuessNums.guessNumsStart();
        }
    }
}
