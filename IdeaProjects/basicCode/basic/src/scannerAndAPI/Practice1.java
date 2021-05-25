package scannerAndAPI;

import java.util.Scanner;

/*
* 题目: 键盘输入三个数字,然后求出最大值
* */
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the first number:");
        int a = sc.nextInt();
        System.out.println("Please input the secornd number:");
        int b = sc.nextInt();
        System.out.println("Please input the third number:");
        int c = sc.nextInt();
        int temp;
        temp = a > b ? a : b;
    }
    }