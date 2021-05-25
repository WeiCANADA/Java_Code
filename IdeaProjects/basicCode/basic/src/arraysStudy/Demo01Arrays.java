package arraysStudy;
/*
* java.util.Arrays 是一个与数组相关工具,提供大量静态方法,用来实现数组常见操作.
*
* 几个常用Arrays类的方法
*  public static String toString(Array); ,将数组变成字符串
*  public static void sort(Array);//按照默认升序对数组元素进行排列.
*
*  备注:
*  1.如果是数值,sort默认安装升序从小到大;
*  2.字符串,sort默认安装字母升序
*  3.自定义类型,那么需要有Comparable or Comparator接口的支持.
* */

import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        int[] array = new int[] {12, 23, 34};
        String intStr = Arrays.toString(array);
        System.out.println(intStr);

        int[] array1 = new int[] {1, 4, 65, 46, 63, 12};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        String[] array2 = new String[] {"bbb", "ccc", "aaaa"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
