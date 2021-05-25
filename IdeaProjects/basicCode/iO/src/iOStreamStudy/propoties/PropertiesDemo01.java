package IOStreamStudy.propoties;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo01 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("张曼玉", "39");
        properties.put("张柏芝", "39");
        properties.put("张惠妹", "39");

        System.out.println(properties);

        Set<Object> set = properties.keySet();
        for(Object obj : set){
            Object o = properties.get(obj);
            System.out.println(obj + "=" + o);
        }
    }
}
