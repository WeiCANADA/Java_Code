package arraysStudy;

import java.util.Arrays;

/*
* 题目,将随机一个字符串升序排列并倒序打印
* //随机字符串
* //升序排列,String --->char[].method:tochararray();---->Arrays.sort
* 倒序打印forr
* */
public class Demo02ArraysPractice {
    public static void main(String[] args) {
        String str = "dsjhfwolcknieoienvmnzjseu";
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.println(charArray[i]);
        }
    }
}
