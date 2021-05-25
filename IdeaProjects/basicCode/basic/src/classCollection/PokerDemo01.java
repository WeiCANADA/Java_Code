package classCollection;

import java.util.ArrayList;
import java.util.Collections;

/*
* 需求: 通过程序实现斗地主过程中的洗牌,发牌和看牌
*
* 思路:
*   1.创建牌盒用ArrayList实现
*       花色 colors
*       2~~K,A;
*        大王,小王
*   2.牌盒装牌
*       pokerBox
*   2.2 洗牌
*   3.发牌,遍历集合,给三个玩家发牌
*   4.看牌,创建一个看牌方法 三个玩家分别遍历自己的牌
*
* */
public class PokerDemo01 {
    public static void main(String[] args) {
        //1.创建牌盒用ArrayList实现
        String[] colors = new String[]{"♥", "♠", "♦","♣"};
        String[] numbers = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        //创建牌盒
        ArrayList<String> pokerBox = new ArrayList<>();
        //装牌
        for(String color : colors){
            for(String number : numbers){
                pokerBox.add(color + number);
            }
        }
        pokerBox.add("大王");
        pokerBox.add("小王");
        //洗牌
        Collections.shuffle(pokerBox);

        //发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> last3Pokers = new ArrayList<>();

        for (int i = 0; i < pokerBox.size(); i++) {
            String card = pokerBox.get(i);
            if(i < 3){
                last3Pokers.add(card);
            }else if(i % 3 == 0){
                player1.add(card);
            }else if(i % 3 == 1){
                player2.add(card);
            }else if(i % 3 == 2){
                player3.add(card);
            }
        }

        //调用看牌方法遍历每个人的牌
        lookPokers("play1", player1);
        lookPokers("play2", player2);
        lookPokers("play3", player3);
        lookPokers("底牌", last3Pokers);

    }
    //看牌方法
    public static void lookPokers(String name, ArrayList<String> pai){
        System.out.println(name + "的牌:");
        for(String str : pai){
            System.out.println(str);
        }
    }
}
