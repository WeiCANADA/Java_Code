package mathMethodStudy;

import java.util.Scanner;

/*
* 题目: 统计键盘输入的2个double数字之间[min,max]这个区间的绝对值大于25 或小于15的整数的个数
*
* */
public class mathMethodPractice {
    public static void main(String[] args) {
        int counting = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入最小的数字min");
        double min =sc.nextDouble();
        System.out.println("请输入最大的数字max");
        double max = sc.nextDouble();
        System.out.println((int) Math.ceil(min));
        System.out.println((int) Math.floor(max));
        for (int i = (int) Math.ceil(min);  i<Math.floor(max) ; i++) {
            if(Math.abs(i) > 25 || Math.abs(i) <15) {
                counting++;
            }
        }
        System.out.println(counting);
    }

}
