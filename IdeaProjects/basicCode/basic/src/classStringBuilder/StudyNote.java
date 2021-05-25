package classStringBuilder;
/*
StringBuilder 构造方法:
* public StringBuilder()构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
* public StringBuilder(String str)构造一个字符串生成器，并初始化为指定的字符串内容。该字符串生成器的初始容量为 16 加上字符串参数的长度。
 * */
public class StudyNote {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder("World");
        System.out.println(sb);//null
        sb.append("Hello");
        System.out.println(sb);//Hello;
        sb.append(sb1);
        System.out.println(sb);//Hello World
        //链式编程
        sb.append(1).append(2).append(3).append("!");
        System.out.println(sb);
        //String 和StringBuilder 类型相互转换
        String sb2 =sb.toString();//StringBuilder --> String
        String sb3 = "Hello Java";
        StringBuilder sb4 = new StringBuilder(sb3);
        System.out.println(sb2 + sb4);
    }
}
