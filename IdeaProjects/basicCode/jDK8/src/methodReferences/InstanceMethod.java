package methodReferences;

import java.util.Date;
import java.util.function.Supplier;

/*
 * 4.特定对象的方法引用：它的语法是instance::method
 * */
public class InstanceMethod {

    public static void main(String[] args) {
        Date date = new Date();
        Supplier<Long> supplier = () -> date.getTime();
        System.out.println(supplier.get());


        //instance::method
        Supplier<Long> supplier1 = date::getTime;
        System.out.println(supplier.get());

    }
}
