package mathMethodStudy;
/*
* java.util.Math 类是数学相关的工具类,里面提供了大量的静态方法,完成数学运算.
* Math 类method 举例
* public static double abs(double a);绝对值
* public static double ceil(double a);向上取整
* public static double floor(double a);向下取整
* public static long round(double a);四舍五入
* */
public class Demo01Math {
    public static void main(String[] args) {
        //Math.abs(double a);
        System.out.println(Math.abs(-67.5));
        //Math.ceil(double a);
        System.out.println(Math.ceil(34.1));
        //Math.floor(double a);
        System.out.println(Math.floor(99.9));
        //Math.round(double a);
        System.out.println(Math.round(3983.234));
    }
}
