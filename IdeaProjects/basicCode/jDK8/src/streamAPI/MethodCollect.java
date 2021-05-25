package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodCollect {
    public static void main(String[] args) {
        Stream<String> ss = Stream.of("111", "12", "33", "23", "11");

        //将流中的数组转到集合当中
        // List<String> l = ss.collect(Collectors.toList());
        //Set<String> set = ss.collect(Collectors.toSet());
        //ArrayList<String> arrayList = ss.collect(Collectors.toCollection(ArrayList::new));

        //将流中的数据collect到数组当中
        String[] strings = ss.toArray(String[]::new);
        for (String string : strings) {
            System.out.println("string = " + string + ", 长度:" + string.length());
        }
    }
}

