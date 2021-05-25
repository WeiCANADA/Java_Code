package streamAPI;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamTest {
    public static void main(String[] args) {

        //static <T> Stream<T> of(T... values)
        // public static<T> Stream<T> of(T... values) {
        //        return Arrays.stream(values);

        Stream<Integer> integerStream = Stream.of(1, 1, 2, 3, 4);
        //static IntStream of(int... values)
        IntStream intStream = IntStream.of(2, 3, 34);
        //public interface ToIntFunction<T>
        //    int applyAsInt(T value);

        IntStream intStream1 = integerStream.mapToInt(Integer::intValue);
        IntStream concat = IntStream.concat(intStream, intStream1);
        System.out.println(concat.sum());

    }

}
