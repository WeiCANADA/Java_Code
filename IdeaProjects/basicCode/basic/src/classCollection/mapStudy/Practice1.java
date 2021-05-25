package classCollection.mapStudy;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
*
* 键盘输入一个有字母和数字组成的字符串,统计字符串中每个字母数字出现的次数,并依次输出.
* 分析:使用TreeMap or HashMap? <Character, Integer>(null null) 字符作为key, 计数作为value
* 键盘输入 Scanner 方法, String --->将字符串转为字符数组 char[] charArray = toCharArray() --->遍历字符数组
* 取出每一个字符 增强for --->将取出的字符char 在map集合中找key, 如果返回null,则放入 (key:char, value:1 );若果返回不是null
* 则++ ---->遍历map集合.
*
* */
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> characterIntegerTreeMap = new HashMap<Character, Integer>();
        System.out.println("请输入由数字和字母组成的字符串:");
        String str = sc.nextLine();

        char[] charArray = str.toCharArray();
        for (Character ch : charArray){
            Integer i = characterIntegerTreeMap.get(ch);
            if(i == null){
                characterIntegerTreeMap.put(ch, 1);
            }else{
                i++;
                characterIntegerTreeMap.put(ch, i);
            }
        }
        Set<Character> charactersSet = characterIntegerTreeMap.keySet();
        for(Character ch : charactersSet){
            Integer i = characterIntegerTreeMap.get(ch);
            System.out.println(ch +"\t" + i);
        }
    }
}
