package methodReferences.classNew;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class ClassNew {
    public static void main(String[] args) {
        // T get();
 /*       Supplier<Person> supplier = () -> new Person();
        System.out.println(supplier.get());*/

        Supplier<Person> supplier1 = Person::new;
        //System.out.println( supplier1.get());

        //public interface BiFunction<T, U, R> {
        //    R apply(T t, U u);
        BiFunction<String, Integer, Person> biFunction = Person::new;
        // Person pig = biFunction.apply("Pig", 3);
        //System.out.println(pig);
    }
}
