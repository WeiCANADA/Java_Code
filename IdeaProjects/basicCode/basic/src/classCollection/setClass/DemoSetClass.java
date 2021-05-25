package classCollection.setClass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
* Set一个不包含重复元素的 collection
* HashSet 此类实现 Set 接口，由哈希表（实际上是一个 HashMap 实例）支持。它不保证 set 的迭代顺序
* */
public class DemoSetClass {
    public static void main(String[] args) {
        Set<String>  set = new HashSet<>();
        set.add("Hello");
        set.add("World");
        set.add("Java");
        set.add("!!!!");

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for(String str : set){
            System.out.println(str);
        }
    }
}
