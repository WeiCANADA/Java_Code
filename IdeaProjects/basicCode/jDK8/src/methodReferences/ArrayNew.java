package methodReferences;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.function.Function;

public class ArrayNew {
    //5.TypeName[] :: New 调用数组的构造器
    @Test
    public void test() {
        //  R apply(T t);
 /*       Function<Integer,int[]> function = len -> new int[len];
        int[] arr = function.apply(10);
        */

        Function<Integer, int[]> function1 = int[]::new;
        int[] arr1 = function1.apply(11);
        System.out.println(Arrays.toString(arr1));
    }

}
