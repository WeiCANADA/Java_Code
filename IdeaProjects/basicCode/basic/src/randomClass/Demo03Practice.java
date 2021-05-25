package randomClass;
//题目:用代码模拟猜数字游戏:

import java.util.Random;
import java.util.Scanner;

public class Demo03Practice {
    public static void main(String[] args) {
        Random r = new Random();
       int randomNum = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
//while(true)
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入猜测1-100整数");
            int guessNum = sc.nextInt();
            if(guessNum > randomNum){
                System.out.println("输入的数字太大");
            }else if(guessNum < randomNum){
                System.out.println("输入的数字太小");

            }else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
        System.out.println("游戏结束!");


    }
}
