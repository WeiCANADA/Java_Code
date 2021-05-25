package classCollection.PracticeDemo02;
/*
* 案例:编写一个程序,获取10个1-20之间的随机数,要求随机数不能重复,并在控制台输出.
* */

import java.util.*;

public class RandomNumbers {
    public static void main(String[] args) {
        //创建对象
        Random r = new Random();
        Set<Integer> setArray = new HashSet<>();

        //添加对象
        while (setArray.size() < 10) {
            Integer num = r.nextInt(20) + 1;
            setArray.add(num);
        }
        //遍历集合
        for(Integer integer : setArray){
            System.out.println(integer);
        }
    }
}
