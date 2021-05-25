package functionInterface;
/*
* 判断String既有H还有W
* default Predicate<T> and(Predicate<? super T> other)
*
* 判断StringH或W
default Predicate<T> or(Predicate<? super T> other)
* */

import java.util.function.Predicate;

public class Interface_Predicate1 {
    public static void main(String[] args) {
        and(str -> {
                    return str.contains("H");
                }, str -> {
                    return str.contains("W");
                }
        );

        or(str -> {
                    return str.contains("H");
                }, str -> {
                    return str.contains("W");
                }
        );

    }

    //判断既有H还有W
    static void and(Predicate<String> p, Predicate<String> p1) {
        boolean b = p.and(p1).test("Hello,World");

        System.out.println("既有H还有W?" + b);

    }

    //判断StringH或W
    static void or(Predicate<String> p, Predicate<String> p1) {
        boolean b = p.or(p1).test("Hello,World");

        System.out.println("既有H还有W?" + b);
    }
}
