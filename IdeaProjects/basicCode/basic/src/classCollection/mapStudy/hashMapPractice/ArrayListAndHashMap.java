package classCollection.mapStudy.hashMapPractice;

import java.util.*;

/*
* 需求: 创建一个ArrayList Collection ,存储3个元素,每一个元素都是HashMap,每一个HashMap的Key 和value 都是String,并遍历.
* */
public class ArrayListAndHashMap {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<HashMap<String, String>> hashMapArrayList = new ArrayList<>();

        //HashMap 并添加元素
        HashMap<String,String> hashMap1 = new HashMap<>();
        HashMap<String,String> hashMap2 = new HashMap<>();
        HashMap<String,String> hashMap3 = new HashMap<>();
        hashMap1.put("Bill", "Hillary");
        hashMap2.put("Barack", "Michelle");
        hashMap3.put("Biden", "Jill");

        //将hashMap 作为元素存入ArrayList
        hashMapArrayList.add(hashMap1);
        hashMapArrayList.add(hashMap2);
        hashMapArrayList.add(hashMap3);

        //遍历ArrayList,取出每一HashMap
        for(HashMap<String, String> hashMap : hashMapArrayList){
            //HashMap<String, String> hash= hashMap;
            Set<String> set = hashMap.keySet();
            for(String str : set){
                String value = hashMap.get(str);
                System.out.println(str + "\t" + value);
            }
        }
    }
}
