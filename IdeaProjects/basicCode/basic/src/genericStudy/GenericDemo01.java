package genericStudy;
/*
*测试类
* */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo01 {
    public static void main(String[] args) {
        //Collection c = new ArrayList();
        Collection<String> c = new ArrayList<>();
        c.add("刘斯坦");
        //c.add(100);
        c.add("100");
        //Iterator iterator = c.iterator();
        System.out.println("------泛型类示例------");
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()){
           // System.out.println( (String) iterator.next());
            /*刘斯坦
            /Exception in thread "main" java.lang.ClassCastException:
            java.lang.Integer cannot be cast to java.lang.String*/
            String str = iterator.next();
            System.out.println(str);
        }

        //泛型方法
        System.out.println("------泛型方法示例------");
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.show("刘加一");
        genericMethod.show(true);
        genericMethod.show(100);
        genericMethod.show(100.94);

        //泛型接口
        System.out.println("------泛型接口示例------");

        GenericInterface<String> genericInterface = System.out::println;

        genericInterface.show("刘思坦");


    }
}


