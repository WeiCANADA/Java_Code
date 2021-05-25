package exceptionStudy.bingFaXiuGaiException;
/*
 * ����
 * ����һ������:List<String> List = new ArrayList<String>();
 * ����������Ԫ��: list.add("Hello");list.add("world");list.add("java");
 * ��������,�ȵ�ÿһ��Ԫ��,����û��"world"���Ԫ��,�����,�Ҿ����һ��"javaee"
 *
 * ConcurrentModificationException,��������⵽����Ĳ����޸ģ��������������޸�ʱ���׳����쳣��
 * */


import java.util.*;

public class Demo01 {
    public static void main(String[] args) {
        //creat����Object
        List<String> list = new ArrayList<String>();

        //addԪ��
        list.add("Hello");
        list.add("world");
        list.add("Java");

        //��������,�ȵ�ÿһ��Ԫ��,����û��"world"���Ԫ��,�����,�Ҿ����һ��"javaee"
        //Iterator<String> it = list.iterator();
        /*while(it.hasNext()){
            String str = it.next();
            if (str.equals("world")) {
                list.add("javaee");
            }
        }*/
        //forѭ������list����
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.equals("world")) {
                list.add("javaee");
            }
        }
        // output ����object
        System.out.println(list);

        //ʹ��ListInterator������ ����ListInterator�ķ�������list,�͵�����
        System.out.println("ʹ��ListInterator������ ����ListInterator�ķ�������list");
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()){
            System.out.println(lit.next());
        }

        System.out.println("=====remove()====== ����");
        ListIterator<String> lit2 = list.listIterator();
        while (lit2.hasNext()){
            String str = lit2.next();
            if(str.equals("javaee")){
                lit2.remove();
            }
        }
        System.out.println(list);
//        ListIterator<String> lit3 = list.listIterator();
        //�������
        while (lit2.hasPrevious()){
            System.out.println(lit2.previous());
        }

    }
}

