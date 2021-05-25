package stringStudy;

import java.util.Scanner;

/*
 * 题目,键盘输入一个字符串,然后按大写字母,小写字母,数字,和其他类型进行分类打印输出
 *
 *错误点,字符是''不是"".
 * */
public class Demo03Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string:");
        String input = sc.next();
        char[] charArray = input.toCharArray();
        int countUpper = 0;
        int countLower = 0;
        int countNumbers = 0;
        int countOthers = 0;
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if('A' <= ch && ch <= 'Z'){
                countUpper++;
            }else if('a' <= ch && ch <= 'z'){
                countLower++;
            }else if('0' <= ch && ch <= '9'){
                countNumbers++;
            }else{
                countOthers++;
            }
        }

        System.out.println(countUpper);
        System.out.println(countLower);
        System.out.println(countNumbers);
        System.out.println(countOthers);

    }
}
