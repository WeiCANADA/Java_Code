package interFace.InterfaceAsReturnOfMethod;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//ArrayList ��List�ӿڵ� ��ʵ����
        List<String> result = addNames(list);
        System.out.println(result);
        }
    public static List<String> addNames(List<String> list){
        list.add("��˼̹");
        list.add("����Ƚ");
        list.add("����һ");
        return list;
    }
}
