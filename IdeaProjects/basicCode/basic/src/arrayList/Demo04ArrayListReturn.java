package arrayList;

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        Random numS = new Random();
        for (int i = 0; i < 20 ; i++) {
            int num =numS.nextInt(100) + 1;
            listA.add(num);
        }
        listB = getSmallList(listA);
        System.out.println("偶数的个数为:" + listB.size());
        System.out.println(listB);
    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list){
        ArrayList<Integer>  listB = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if(num % 2 == 0){
                listB.add(num);
            }else {
                continue;
            }
        }
        return listB;
    }

}
