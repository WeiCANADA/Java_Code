package streamAPI;

import java.util.*;
import java.util.stream.Stream;

public class WaysToGetStream {
    public static void main(String[] args) {

        //方式一

        //Collection 集合使用
        Collection<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        Stream<String> s = list.stream();

        Set<String> set = new TreeSet<>();
        Stream<String> s1 = set.stream();

        //Map 集合使用stream
        Map<Integer, String> map = new HashMap<>();
        Stream<Integer> s2 = map.keySet().stream();
        Stream<String> s3 = map.values().stream();

        //方式二
        //static <T> Stream<T> of(T... values)
        Stream<String> aa = Stream.of("aa", "bb", "cc");

        String[] arr = { "aa", "bb", "cc" };
        Stream<String> arrStream = Stream.of(arr);

        //int[] arr1 = {1, 3, 4, 6};
        //Stream<int[]> arr11 = Stream.of(arr1);
        //不支持基本数据类型的stream

    }
}
