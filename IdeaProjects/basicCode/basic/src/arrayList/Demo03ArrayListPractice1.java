package arrayList;

import javaBean.Student;

import java.util.ArrayList;

/*
* 定义以指定格式打印集合的方法(ArrayList类型作为参数),使用{}括号 集合,使用分隔符@分隔没给元素,格式参照{元素@元素@元素}
* */
public class Demo03ArrayListPractice1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Liu,Sitan");
        list.add("Liu,Xiran");
        list.add("Liu,Jiayi");
        System.out.println(list);
        arrayListPrint(list);
    }

    /*//三要素:
    返回值类型 void
    方法名:arrayListPrint
    参数列表:ArrayList,aL

    */
    public static void arrayListPrint(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                System.out.print(list.get(i) + "@");
            } else {
                System.out.print(list.get(i));
            }
        }
        System.out.println("}");
    }
}
