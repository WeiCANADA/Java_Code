package method;
/*
对于功能类型的方法来说,因为参数列表不一样,却要记住那么多不同的方法名称,太麻烦.
方法的overload,多个方法的名称不一样,但是参数列表不一样.

方法重载与下列因素有关:
1.参数格式不同
2,参数的类型不同
3.参数多类型顺序不同

方法重载与下列因素无关:
1.与参数的名称无关
2.与方法的返回类型无关.

*/
public class MethodOverLoad {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
    }
    public static int sum(int a, int b){
        System.out.println("2个整数相加的方法执行!");
        return a + b;
    }

    public static int sum(int a, int b,int c){
        System.out.println("3个整数相加的方法执行!");
        return a + b + c;
    }

    public static int sum(int a, int b,int c, int d){
        System.out.println("4个整数相加的方法执行!");
        return a + b + c + d;
    }
}
