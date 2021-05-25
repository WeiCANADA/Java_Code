package method;
/*
参数:
有参数:小括号当中有内容,当一个方法需要一些数据条件,才能完成任务的时候,就要有参数;

无参数:小括号当中留空,一个方法不需要任何数据条件,自己就能独立完成任务,就是无参数.

**/
public class MethodParam {
    public static void main(String[] args) {
    method1();
    method2(3,5);
    }
    public static void method1(){
        for(int a = 0; a <= 10; a++){
            System.out.println("Hello, World!!");
        }
    }
    public static void method2(int a, int b){
        System.out.println(a * b);
    }
}
