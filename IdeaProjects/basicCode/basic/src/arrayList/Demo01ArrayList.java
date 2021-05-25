package arrayList;

import java.util.ArrayList;

/*
*
* 常用Method of ArrayList
* public boolean add(E e);
* public E get (int index);
* public E remove(int index);
* public int size();
* */
public class Demo01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]
        boolean success = list.add("刘思坦");
        boolean success1 = list.add("刘曦冉");
        boolean success2 = list.add("刘加一");
        boolean success3 = list.add("张三");
        System.out.println("添加是否成功?" + success + success1 + success2 + success3);
        System.out.println(list);//[刘思坦, 刘曦冉, 刘加一,张三]
        System.out.println(list.get(0));//刘思坦
        String whoRemoved = list.remove(3);
        System.out.println("移除的人是: " + whoRemoved);
        int  listSize = list.size();//获取list 几何数组的长度
//        遍历list数组
        for (String s : list) {
            System.out.println(s);
        }

       /*
       list.clear();
        System.out.println(list);//[]
        */
       list.add(1,"liusitan");
        System.out.println(list);

    }
}
