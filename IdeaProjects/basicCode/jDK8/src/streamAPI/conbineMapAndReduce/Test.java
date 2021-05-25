package streamAPI.conbineMapAndReduce;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        /*
        Integer reduce = Stream.of(
                new Person("张三", 11),
                new Person("李四", 33),
                new Person("王麻子", 88),
                new Person("赵六", 36),
                new Person("刘大", 23)
        ).map(Person::getAge)
                .reduce(0, Integer::sum);
                */
        List<Person> list = new LinkedList<>();
        Collections.addAll(list,
                new Person("张三", 11),
                new Person("李四", 33),
                new Person("王麻子", 88),
                new Person("赵六", 36),
                new Person("赵六", 31),
                new Person("刘大", 23),
                new Person("刘大", 88),
                new Person("刘大", 11));

        ageSum(list);
        ageMax(list);
        sameNameCount(list);
    }

    //统计"刘大"有几个人
    private static void sameNameCount(List<Person> list) {
        Integer count = list.stream().map(Person::getName).map(name -> {
            if (name.equals("刘大")) {
                return 1;
            } else {
                return 0;
            }
        }).reduce(0, Integer::sum);
        System.out.println(count);
    }

    //获取ageSum
    static void ageSum(List<Person> list) {
//        Integer ageSum = list.stream().map(Person::getAge)
//                .reduce(0, Integer::sum);
//        System.out.println(ageSum);

        //用IntStream改进
        int ageSum = list.stream().mapToInt(Person::getAge).reduce(0, Integer::sum);
        System.out.println(ageSum);

    }

    //get ageMax
    static void ageMax(List<Person> list) {
//        Optional<Integer> max = list.stream().map(Person::getAge).max((age1, age2) -> age1 - age2);
//        max.ifPresent(System.out::println);
        list.stream().map(Person::getAge).max((age1, age2) -> age1 - age2).ifPresent(System.out::println);
    }
}
