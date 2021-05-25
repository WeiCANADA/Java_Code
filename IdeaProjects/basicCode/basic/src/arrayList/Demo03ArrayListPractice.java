package arrayList;
/*
* 生成6个1-33的随机整数,添加到集合,并遍历集合.
* */
import java.util.ArrayList;
import java.util.Random;

public class Demo03ArrayListPractice {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> listInt = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int rNum = r.nextInt(33) + 1;
            listInt.add(rNum);
        }
        for (int i = 0; i < listInt.size(); i++) {
            System.out.println(listInt.get(i));
        }
    }

}
