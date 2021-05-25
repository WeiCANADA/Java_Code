package method;
/*
返回值:
* 带返回值
* 不带返回值
*
* */
public class MethodReturn {
    public static void main(String[] args) {
        methodPrint(3,5);
        int result;
        result = methodreturn(4, 6);
        System.out.println("The result of return is " + result);
    }
    public static void methodPrint(int a, int b){
        int result;
        result = a + b;
        System.out.println("The result of no return is " + result);
    }
    public static int methodreturn(int a, int b){
        int result;
        result = a + b;
        return result;
    }
}
