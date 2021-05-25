package arrayList;

import java.util.ArrayList;

/*
* 如果向ArrayList当中存储基本类型数据,必须使用基本类型的包装类.
* 基本类型      包装类(引用类型,包装类都位于java.lang包下)
* byte          Byte
* short         Short
* int           Integer
* long          Long
* double        Double
* char          Character
* boolean       Boolean
* 从JDK1.5+开始,支持自动装箱,自动拆箱.
* */
public class Demo02ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //错误写法,泛型只能是引用类型,不能是基本类型
     //   ArrayList<int> listA = new ArrayList<int>();
        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(100);
        listInt.add(200);
        System.out.println(listInt);
        int num = listInt.get(1);
        System.out.println(num);
    }
}
