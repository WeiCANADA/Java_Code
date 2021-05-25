package methodReferences;

import java.util.function.Consumer;

/*
方法引用通过方法的名字来指向一个方法。

方法引用可以使语言的构造更紧凑简洁，减少冗余代码。

方法引用使用一对冒号 :: 。

常用引用方式:
1.构造器引用：它的语法是Class::new，或者更一般的Class< T >::new
2.静态方法引用：它的语法是Class::static_method
3.特定类的任意对象的方法引用：它的语法是Class::method
4.特定对象的方法引用：它的语法是instance::method
5.TypeName[] :: New 调用数组的构造器

* */
//使用lambda 求数组之和
public class Intro {
    public static void main(String[] args) {

        //定义一个数组
        int[] arr = { 10, 11, 12, 13 };
        //lambda及method reference
        consume(arr, Intro::getSum);
    }

    //定义一个求和方法
    static void getSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }

    static void consume(int[] arr, Consumer<int[]> consumer) {
        consumer.accept(arr);
    }
}

