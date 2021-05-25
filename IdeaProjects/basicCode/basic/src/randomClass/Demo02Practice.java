package randomClass;

import java.util.Random;

/*
* 题目:随机在[1-10]范围类取100个随机数
* random 类
* for循环100
* nextInt(10)+1
*
* */
public class Demo02Practice {
    public static void main(String[] args) {
        Random r = new Random();
                for (int i = 0; i <100 ; i++) {
            int n = r.nextInt(10) + 1;
            System.out.println("随机数为" + n);
        }
    }
}
