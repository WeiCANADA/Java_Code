package IOStreamStudy.array_login_regist.guessNums;

import java.util.Random;
import java.util.Scanner;

public class GuessNums {
    private GuessNums() {

    }

    public static void guessNumsStart() {

        //产生随机数
        Random random = new Random();
        int randomNum;
        randomNum = random.nextInt(100) + 1;

        while (true) {
            //键盘录入
            System.out.println("请输入[1,100]之间的数字");
            Scanner sc = new Scanner(System.in);
            int guessNum;
            guessNum = sc.nextInt();

            //猜数字
            if (guessNum == randomNum) {
                System.out.println("恭喜你猜对了");
                break;
            } else if (guessNum > randomNum) {
                System.out.println("大了");
            } else {
                System.out.println("小了");
            }
        }
    }
}
