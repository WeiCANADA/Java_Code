package scannerAndAPI;

import java.util.Scanner;

/*
* 题目:键盘输入两个int数字,并且求出和值.
* */
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("和是:" + sum);
    }
}
