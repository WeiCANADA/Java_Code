package classCollection;

import java.lang.module.FindException;
import java.util.*;

/*
* 需求: 模拟斗地主洗牌和发牌并对牌进行排序
* 思路:
* 使用HashMap集合创建pokerBox牌盒 key 存储index (0-53),value 存储存牌,
* 制作54张牌
* 创建ArrayList集合索引indexArray,使用Collections.shuffle 方法对index随机排序
* 创建TreeMap 玩家
* 发牌 key 为indexArray 内的索引,value 为key在pokerBox找对应的value
* 定义看牌方法遍历TreeMap集合玩家
* 调取看牌方法
*
* */
public class PokerDemo02 {
    public static void main(String[] args) {
        //创建牌盒
        HashMap<Integer, String> pokersBox = new HashMap<Integer, String>();

        //制牌
        String[] colors = new String[]{"♥", "♠", "♦","♣"};
        String[] numbers = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        //存入牌盒
        int key = 0;
        for (String color : colors) {
            for(String number : numbers){
                pokersBox.put(key,color + number);
                key++;
            }
        }
        pokersBox.put(key, "大王");
        key++;
        pokersBox.put(key, "小王");
        key++;
       // System.out.println(key);

        //洗牌
        ArrayList<Integer> indexArray = new ArrayList<>();
        for (int i = 0; i < key; i++) {
            indexArray.add(i);
        }
        //System.out.println(indexArray.size());
        Collections.shuffle(indexArray);

        //Treemap 玩家
        TreeMap<Integer, String> player1 = new TreeMap<>();
        TreeMap<Integer, String> player2 = new TreeMap<>();
        TreeMap<Integer, String> player3 = new TreeMap<>();
        TreeMap<Integer, String> last3Cards = new TreeMap<>();

        //发牌
        for (int i = 0; i < indexArray.size() ; i++) {
            int index = indexArray.get(i);
            String value = pokersBox.get(index);
            if(i < 3){
                last3Cards.put(index,value );
            }else if(i % 3 == 0){
                player1.put(index, value);
            }else if(i % 3 == 1) {
                player2.put(index, value);
            }else if(i % 3 == 2) {
                player3.put(index, value);
            }
        }

        //调取看牌方法看牌
        lookPokers("player1", player1);
        lookPokers("player2", player2);
        lookPokers("player3", player3);
        lookPokers("底牌", last3Cards);
    }
    //定义看牌方法,遍历treeMap集合
    public static void lookPokers(String name, TreeMap<Integer, String> player){
        System.out.println(name + "的牌是:");
        int count = 0;
        Set<Integer> integerSet = player.keySet();
        for(Integer integer : integerSet){
            count++;
            System.out.println(count + player.get(integer));
        }
    }
}
