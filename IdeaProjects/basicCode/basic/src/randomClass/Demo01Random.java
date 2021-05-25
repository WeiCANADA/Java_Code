package randomClass;

import java.util.Random;

/*
* Random 类用来生成随机数字.使用起来也三个步骤
* 1.导包: import java.util.Random;
* 2.创建对象: Random r = new Random();
* 3.使用: int num = r.nextInt();
* */
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数为:" + num);
        int num1 = r.nextInt(100);
        System.out.println("0 - 100 之间的随机整数:" + num1);
    }


}
