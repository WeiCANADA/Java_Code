package method;
/*
* 定义方法,分别比较两个byte\short\int\long类型的数据是否相等.
*
* */
public class MethodOverLoadPractice1 {
    public static void main(String[] args) {
    byte a;
    byte b;
    a = 10;
    b = 20;
        System.out.println(sameOrNot(a, b));
        System.out.println(sameOrNot((short) 10, (short) 10));
        System.out.println(sameOrNot(10, 20));
        System.out.println(sameOrNot(15L, 17L));
    }
    public static boolean sameOrNot(byte a, byte b){
        System.out.println("两个byte参数比较的方法");
        boolean same;
        if(a == b){
            same = true;
        }else{
            same = false;
        }
        return same;
    }
    public static boolean sameOrNot(short a, short b){
        System.out.println("两个short参数比较的方法");
        boolean same = a==b ? true:false;
        return same;
    }
    public static boolean sameOrNot(int a, int b){
        System.out.println("两个int参数比较的方法");
        if(a == b){
            return true;
        } else{
            return false;
        }
    }
    public static boolean sameOrNot(long a, long b){
        System.out.println("两个long参数比较的方法");
        return  a == b;
    }
    }
