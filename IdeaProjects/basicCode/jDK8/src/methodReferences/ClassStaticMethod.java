package methodReferences;

import java.util.function.Supplier;

public class ClassStaticMethod {
    public static void main(String[] args) {
  /*
  Supplier<Long> supplier = () -> {
           return System.currentTimeMillis();
        };
        System.out.println(supplier.get());
        */

        Supplier<Long> supplier1 = System::currentTimeMillis;
        System.out.println(supplier1.get());

    }
}
