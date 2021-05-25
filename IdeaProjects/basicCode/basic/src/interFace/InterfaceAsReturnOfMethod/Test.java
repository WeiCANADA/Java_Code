package interFace.InterfaceAsReturnOfMethod;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//ArrayList 是List接口的 的实现类
        List<String> result = addNames(list);
        System.out.println(result);
        }
    public static List<String> addNames(List<String> list){
        list.add("刘思坦");
        list.add("刘曦冉");
        list.add("刘加一");
        return list;
    }
}
