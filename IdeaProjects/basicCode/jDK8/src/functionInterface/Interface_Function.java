package functionInterface;
/*
 * 一个将List<Integer>集合使用计算元素之和并将结果以String输出,Interface Function<T, R>.
 * 1.一个function 方法传入两个参数List<Integer> list和 Function<List<Integer> ,String> function
 * 在方法里使用R apply(T t)方法.
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Interface_Function {
    public static void main(String[] args) {
        //创建集合
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(23);
        list.add(234);
        //调用方法并用lambda并重写R apply(T t)方法
        function(list, (arrayList1) -> {
            int sum = 0;
            for (Integer i : arrayList1) {
                sum = +i;
            }
            return Integer.toString(sum);
        });
    }

    static void function(List<Integer> list, Function<List<Integer>, String> function) {

        String str = function.apply(list);
        System.out.println(str);
    }
}