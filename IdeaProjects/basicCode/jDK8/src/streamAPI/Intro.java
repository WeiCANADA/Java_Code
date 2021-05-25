package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*案列:
 * 人名集合
 * 找出姓张的
 * 找个名字长度等于3的
 * 遍历输出
 *_______________
 *
 * Stream 使用注意事项
 * 1.同一个Stream不能重复操作
 * 2.Stream方法返回一个新的Stream
 * 3.Stream不调用终结方法,中间的操作不会执行
 * */
public class Intro {
    public static void main(String[] args) {
        //人名集合
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("乔峰");
        list.add("张三丰");
        list.add("东方不败");
        list.add("张钱");

        // Predicate /boolean test(T t);
        list.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                // interface Consumer<T>
                // void accept(T t)
                .forEach(System.out::println);


        //传统方法
        //找出姓张的
        List<String> zhangList = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {
                zhangList.add(s);
            }
        }
        //找出三个字的
        List<String> threeList = new ArrayList<>();
        for (String s : zhangList) {
            if (s.length() == 3) {
                threeList.add(s);
            }
        }
        for (String s : threeList) {
            System.out.println("名字三个字并姓张的是:" + "\t" + s);
        }

    }
}
