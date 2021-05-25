package methodReferences;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ClassMethod {
    public static void main(String[] args) {
        Function<String, Integer> function = str -> str.length();
        int len = function.apply("Hello");
        System.out.println(len);

        Function<String, Integer> function1 = String::length;
        int len1 = function1.apply("");
        System.out.println(len1);

        BiFunction<String, Integer, String> function2 = String::substring;
        String str = function2.apply("HelloWorld", 1);
        System.out.println(str);

    }
}
