package functionInterface;

import java.util.function.Predicate;

/*
 *Interface Predicate<T>
 * 判断输入的名称是否为长名称,>3个汉子就算长.
 * boolean test(T t)
 *
 * //判断没有W
default Predicate<T> negate()
 * */
public class Interface_Predicate {
    public static void main(String[] args) {
        isLong(str -> {
            return str.length() > 3;
        });

        negate(str -> str.contains("W"));
    }

    static void isLong(Predicate<String> predicate) {
        boolean b = predicate.test("Hello, World");
        System.out.println("是长名字吗?" + "\t\"" + b);
    }

    static void negate(Predicate<String> predicate) {
        boolean b = predicate.negate().test("Hello, orld");
        System.out.println("没有W:" + "\t'" + b);
    }
}
