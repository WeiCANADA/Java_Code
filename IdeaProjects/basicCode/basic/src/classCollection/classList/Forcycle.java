package classCollection.classList;

import java.util.ArrayList;
import java.util.Collection;

public class Forcycle {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<>();
        c.add("Hello");
        c.add("great");
        c.add("Java");
        for (String str : c) {
            System.out.println(str);
        }
    }
}
