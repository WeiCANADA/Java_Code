package redListPractice1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int totalMoney, totalCount;
        OpenMode lucy = new OpenMode() {
            @Override
            public ArrayList<Integer> divide(int totalMoney, int totalCount) {
                Random r= new Random();
                ArrayList<Integer> list = new ArrayList<>();
                int leftMoney = totalMoney;
                int leftCount = totalCount;
                for (int i = 0; i < totalCount - 1; i++) {
                    int money = r.nextInt(leftMoney / leftCount * 2 ) + 1;
                    list.add(money);
                    leftMoney-= money;
                    leftCount--;
                }

                list.add(leftMoney);
                return list;
            }
            };
        while(true) {
        System.out.println("totalMoney:");
        totalMoney = sc.nextInt();
            System.out.println("totalCount:");
        totalCount = sc.nextInt();

            if (totalMoney >= totalCount) {
                System.out.println("totalCount:");
                ArrayList<Integer> list = new ArrayList<>();
                list =lucy.divide(totalMoney, totalCount);
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }

                break;
            } else {
                System.out.println("红包金额不能小于红包个数,请重新输入");
            }
        }



    }
}
