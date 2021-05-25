package genericStudy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class KeBianParameter {
    public static void main(String[] args) {
        int sum =sumMethod(10,20,40,50,100);
        System.out.println(sum);

        //可变参数的使用
        //Arrays 类中的方法 public static <T> List<T> asList(T... a)
        List<String> list1 = Arrays.asList("Hello","World", "Java" );
//        list1.add("!!!");//UnsupportedOperationException
//        list1.remove(0);//UnsupportedOperationException
        list1.set(2, "JAVA");
        for (String str : list1){
            System.out.println(str);
        }
        //List interface 中的方法 static <E> List<E> of(E... elements)
        List<? extends Number> numbers = List.of(100, 200.2, 1000000, 3.1415);
        for (Number n : numbers){
            System.out.println(n);
        }

        // Set interface 中的方法 static <E> Set<E> of(E... elements)
        Set<String> stringSet = Set.of("Hello", "world", "Java", "100");
        for (String str : stringSet){
            System.out.println(str);
        }
    }

    public static int sumMethod(int... t){
        int sum = 0;
        for (int i : t){
            sum += i;
        }
        return sum;
    }
}
