package classCollection.mapStudy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        //create the Map Object
        Map<String, String>  map= new HashMap<String, String>();

        //put elements to map
        map.put("Obama","mightier");
        map.put("Cliton","Xilali");
        map.put("习近平","彭丽媛");
        map.put("习近平","彭");

        int mapSize = map.size();
        boolean hasKey = map.containsKey("Obama");
        boolean hasValue = map.containsValue("彭丽媛");
        boolean isEmpty = map.isEmpty();
        //String remove1 = map.remove("Obama");
        //boolean remove2 = map.remove("Cliton", "Xilali");
        //boolean remove21 = map.remove("Cliton", "Xilal");
//        String replace3 = map.replace("习近平", "彭丽媛");
//        System.out.println(replace3);//彭丽媛
        boolean replace4 = map.replace("习近平", "彭丽媛", "p");
        System.out.println(replace4);
        //Collection<String> values = map.values();



        //Iterate over the collection
        //键集合Set<K> keySet() ---> Iterate by for ---> the value of the key is mapped V get(Object key)
        Set<String> keySet = map.keySet();
        for (String str : keySet){
            String value = map.get(str);
            System.out.println(str + "\t" + value);
        }

        //  Set<Map.Entry<K,V>> entrySet()--->Iterate over the collection
        /*Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> me : entrySet){
            System.out.println(me.getKey() + "\n" + me.getValue());
        }

*/
    }
}
