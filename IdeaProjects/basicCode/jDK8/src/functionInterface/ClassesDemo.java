package functionInterface;

import java.util.Arrays;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ClassesDemo {
    public static void main(String[] args) {

        //public interface Supplier<T>
        //T get() Gets a result.
        printResult(() -> {
            int[] intArray = { 11, 34, 56, 67, 56 };
            Arrays.sort(intArray);
            return intArray[intArray.length - 1];
        });

        //public interface Consumer<T>
        //void accept(T t)
        printConsume(str -> {
            System.out.println("ConsumeDemo : " + str.toLowerCase(Locale.ROOT));
        });

        //   default Consumer<T> andThen (Consumer<? super T> after)
        printConsume1(str -> {
                    System.out.println(str.toLowerCase(Locale.ROOT));
                }
                , str -> {
                    System.out.println(str.toUpperCase(Locale.ROOT));
                }
        );

    }

    //T get() Gets a result.
    public static void printResult(Supplier<Integer> supplier) {
        int max = supplier.get();
        System.out.println("MaxInt = " + max);
    }

    //void accept (T t)
    static void printConsume(Consumer<String> consumer) {
        consumer.accept("Hello World!");
    }

    //default Consumer<T> andThen (Consumer<? super T> after)
    static void printConsume1(Consumer<String> c1, Consumer<String> c2) {
        c1.andThen(c2).accept("Hello World!");
    }
}

