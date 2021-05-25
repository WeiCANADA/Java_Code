package stringStudy;
/*
* 题目:定义一个方法,把数组{1,2,3}按照指定格式拼接一个字符串,格式:[word1#word2#word3]
* */
public class Demo03Practice {
    public static void main(String[] args) {
        int[] arrayInt = new int[] {1, 2, 3};
        String str1 = methodWay(arrayInt);
        System.out.println(str1);
    }
    public static String methodWay(int[] arrayInt){
        String str = "[";
        for (int i = 0; i < arrayInt.length; i++) {
            if(i == arrayInt.length - 1){
            str += "word" + arrayInt[i] + "]";
        }else {
                str += "word" + arrayInt[i] + "#";
            }
            }
            return str;
    }
}
