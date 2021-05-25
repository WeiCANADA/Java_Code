package method;

/*
 * 使用println overload 实现各种数据类型的输出
 *
 * */
public class MethodOverLoadPractice2 {
    public static void main(String[] args) {
        myprint('t');
    }

    public static void myprint(byte num) {
        System.out.println(num);
    }

    public static void myprint(short num) {
        System.out.println(num);
    }

    public static void myprint(int num) {
        System.out.println(num);
    }

    public static void myprint(long num) {
        System.out.println(num);
    }

    public static void myprint(char zifu) {
        System.out.println(zifu);
    }
    public static void myprint(float num) {
        System.out.println(num);
    }public static void myprint(double num) {
        System.out.println(num);
    }
    public static void myprint(String str) {
        System.out.println(str);
    }
    public static void myprint(boolean bool) {
        System.out.println(bool);
    }
}

