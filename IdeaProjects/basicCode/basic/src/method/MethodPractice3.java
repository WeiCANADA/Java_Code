package method;
/*
* 题目有求
*
* 定义一个方法,打印指定次数的"hello World!!!"
* */
public class MethodPractice3 {
    public static void main(String[] args) {
    print(5);
    }
    /*
    * 三要素
    * 返回值类型:void
    * 方法名:Print
    * 参数列表:int num
    * */
    public static void print(int num){
        for (int i = 0; i < num ; ++i) {
            System.out.println((i + 1) +"Hello, World!!!");
        }
    }
}
