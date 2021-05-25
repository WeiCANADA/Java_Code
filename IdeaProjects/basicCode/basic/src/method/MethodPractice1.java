package method;
/*
* 题目要求:
*   定义一个方法,用来判断两个数字是否相同.
*
*   问题记录:
*   1.方法体里没有写return
*   2.result 写错了.
* */
public class MethodPractice1 {
    public static void main(String[] args) {
        System.out.println(sameOrNot1(1,3));
        System.out.println(sameOrNot2(3,3));
        System.out.println(sameOrNot3(4,3));
        System.out.println(sameOrNot4(4,4));
    }
    /*
    * 方法三要素:
    * 返回值类型: boolean
    * 方法名称:sameOrNot
    * 参数列表:int a, int b
    * */
    public static boolean sameOrNot1(int a, int b){
        boolean result;
        if(a==b){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
    public static boolean sameOrNot2(int a, int b){
        boolean result;
        result = a==b ? true : false;
        return result;
    }
    public static boolean sameOrNot3(int a, int b){
        boolean result;
        result = a == b;
        return result;
    }
    public static boolean sameOrNot4(int a, int b){
        return a == b;
    }
}
