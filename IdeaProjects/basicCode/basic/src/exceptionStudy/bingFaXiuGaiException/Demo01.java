package exceptionStudy.bingFaXiuGaiException;
/*
 * 需求
 * 我有一个集合:List<String> List = new ArrayList<String>();
 * 里面有三个元素: list.add("Hello");list.add("world");list.add("java");
 * 遍历集合,等到每一个元素,看有没有"world"这个元素,如果有,我就添加一个"javaee"
 *
 * ConcurrentModificationException,当方法检测到对象的并发修改，但不允许这种修改时，抛出此异常。
 * */


import java.util.*;

public class Demo01 {
    public static void main(String[] args) {
        //creat集合Object
        List<String> list = new ArrayList<String>();

        //add元素
        list.add("Hello");
        list.add("world");
        list.add("Java");

        //遍历集合,等到每一个元素,看有没有"world"这个元素,如果有,我就添加一个"javaee"
        //Iterator<String> it = list.iterator();
        /*while(it.hasNext()){
            String str = it.next();
            if (str.equals("world")) {
                list.add("javaee");
            }
        }*/
        //for循环遍历list集合
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.equals("world")) {
                list.add("javaee");
            }
        }
        // output 集合object
        System.out.println(list);

        //使用ListInterator迭代器 并用ListInterator的方法遍历list,和倒遍历
        System.out.println("使用ListInterator迭代器 并用ListInterator的方法遍历list");
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()){
            System.out.println(lit.next());
        }

        System.out.println("=====remove()====== 方法");
        ListIterator<String> lit2 = list.listIterator();
        while (lit2.hasNext()){
            String str = lit2.next();
            if(str.equals("javaee")){
                lit2.remove();
            }
        }
        System.out.println(list);
//        ListIterator<String> lit3 = list.listIterator();
        //反向遍历
        while (lit2.hasPrevious()){
            System.out.println(lit2.previous());
        }

    }
}

