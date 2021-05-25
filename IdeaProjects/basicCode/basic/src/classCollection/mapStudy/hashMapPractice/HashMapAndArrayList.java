package classCollection.mapStudy.hashMapPractice;
//创建一个HashmMap集合,存储三个键值对元素,每一个键值对的键是String, value is ArrayList,每一个ArrayList元素是String,并遍历.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapAndArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList1 = new ArrayList<>();
        ArrayList<String> stringArrayList2 = new ArrayList<>();
        ArrayList<String> stringArrayList3 = new ArrayList<>();
        stringArrayList1.add("北京");
        stringArrayList2.add("上海");
        stringArrayList3.add("南京");

        HashMap<String, ArrayList<String>> stringArrayListHashMap = new HashMap<>();
        stringArrayListHashMap.put("刘思坦",stringArrayList1);
        stringArrayListHashMap.put("刘曦冉",stringArrayList2);
        stringArrayListHashMap.put("刘加一",stringArrayList3);

        Set<String> stringSet = stringArrayListHashMap.keySet();
        for(String str : stringSet){
            ArrayList<String> arrayList = stringArrayListHashMap.get(str);
            for (int i = 0; i < arrayList.size(); i++) {
                String str1 = arrayList.get(i);
                System.out.println(str + "\t" + str1);
            }
        }
    }
}
