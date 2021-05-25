package method;
/*题目:
定义一个方法,用来求出1-100所有数字的和值.

问题记录:
1.return 打错
2.return在for 循环体外部.
* */
public class MethodPractice2 {
    public static void main(String[] args) {
        System.out.println("1 到 100 所有整数的和是: " + sum1_100());
    }
    /*
    * 三要素:
    * 返回值类型 int
    * 方法名sum1_100
    * 参数列表,不需要
    *
    * */
    public static int sum1_100(){
        int sum;
        sum = 0;
        for(int i = 1; i <= 100; i++ ){
            sum += i;
        }
        return sum;
    }
}
