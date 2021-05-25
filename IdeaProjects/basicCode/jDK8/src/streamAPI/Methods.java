package streamAPI;

import java.util.*;
import java.util.stream.Stream;

public class Methods {
    public static void main(String[] args) {
        //创建String集合
        List<String> one = new ArrayList<>();
        Collections.addAll(one, "迪丽热巴", "古力娜扎", "宋远桥", "刘德华", "郭富城", "杨过", "刘德华");
        //c创建int集合
        List<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 2, 2, 4, 13, 42, 21, 66);
        //long count = one.size();
        //Stream<String> stream = one.stream();
        //通过Stream.of方法创建一个Integer流
        Stream<Integer> integerStream = Stream.of(11, 22, 33, 10, 9, 33);

        // findFirstM(one);
        //findAnyM(one);

        reduce(arr);
        reduce1(arr);

        //minM(arr);
        //maxM(arr);

        //mapM(integerStream);

        // sortedM1(integerStream);
        //sortedM2(integerStream);

        //allMatchM(integerStream);
        //noneMatch(integerStream);
        //anyMatch(integerStream);

        //distinctM(one);

        // skipM(one);

        //limitM(one);

        //filterM(stream);


        //count(stream);//6
        // Stream<List<String>> stream1 = Stream.of(one);//基本类型不支持Stream
        //count(stream1);//1

        //forEachM(stream);

    }

    //max
    private static void reduce1(List<Integer> arr) {
        //Integer reduce = arr.stream().reduce(0, (x, y) -> x > y ? x : y);
        Integer reduce = arr.stream().reduce(0, Math::max);
        System.out.println(reduce);
    }

    //集合元素求和
    private static void reduce(List<Integer> arr) {
        //Interface BinaryOperator<T>
        Integer reduce = arr.stream().reduce(0, Integer::sum);
        System.out.println(reduce);
    }

    //输出最小值
    private static void minM(List<Integer> arr) {
        //int compare(T o1, T o2)
        arr.stream().min((n1, n2) -> n1 - n2).ifPresent(System.out::println);
    }

    //输出最大值
    private static void maxM(List<Integer> arr) {
        arr.stream().max((n1, n2) -> n1 - n2).ifPresent(System.out::println);
    }

    private static void findAnyM(List<String> one) {
        Optional<String> any = one.stream().findAny();
        any.ifPresent(System.out::println);

    }

    private static void findFirstM(List<String> one) {
        one.stream().findFirst().ifPresent(System.out::println);


    }

    //boolean anyMatch(Predicate<? super T> predicate
    private static void anyMatch(Stream<Integer> integerStream) {
        System.out.println(integerStream.anyMatch(i -> i > 10));
    }

    //boolean noneMatch(Predicate<? super T> predicate)
    private static void noneMatch(Stream<Integer> integerStream) {
        System.out.println(integerStream.noneMatch(i -> i > 10));
    }

    //boolean allMatch(Predicate<? super T> predicate)
    private static void allMatchM(Stream<Integer> integerStream) {
        System.out.println(integerStream.allMatch(i -> i > 10));
    }

    //剔除重复元素
    private static void distinctM(List<String> list) {
        list.stream().distinct().forEach(System.out::println);
    }

    ////降序排列
    private static void sortedM1(Stream<Integer> integerStream) {
        //int compare(T o1, T o2);
        integerStream.sorted((i1, i2) -> i2 - i1)
                .forEach(System.out::println);
    }

    //自然排序
    private static void sortedM2(Stream<Integer> integerStream) {
        integerStream.sorted()
                .forEach(System.out::println);
    }

    //将String Stream 转换为Integer Stream
    private static void mapM(Stream<Integer> integerStream) {
        // Function<T, R>    R apply(T t);
        //Stream<String> stringStream = integerStream.map(integer -> Integer.toString(integer));
        //stringStream.forEach(System.out::println);
        integerStream.map(integer -> Integer.toString(integer))
                .forEach(System.out::println);
    }

    //找出集合中长度为3的元素
    // Stream<T> filter(Predicate<? super T> predicate)
    private static void filterM(List<String> list) {
        //Predicate
        // boolean test(T t)
        list.stream()
                .filter(str -> str.length() == 3)
                .forEach(System.out::println);
    }

    //统计元素个数
    // long count()
    private static void count(List<?> list) {
        System.out.println((long) list.size());
    }

    //遍历输出
    // void forEach(Consumer<? super T> action)
    private static void forEachM(List<?> list) {
        //Consumer  void accept(T t);
        list.forEach(System.out::println);
    }

    //取集合中前四个
    private static void limitM(List<?> list) {
        list.stream()
                .limit(4)
                .forEach(System.out::println);
    }

    //跳过前3个,输出
    private static void skipM(List<?> list) {
        list.stream()
                .skip(3)
                .forEach(System.out::println);
    }
}
