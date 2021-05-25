package classString;
/*String 方法的特点*/
public class Text {
    public static void main(String[] args) {
        char[] cha = {'a', 'b', 'c'};
        String s1 = new String(cha);
        String s2 = new String(cha);
        String s3 = "abc";
        String s4 = "abc";
        //比较地址是否相同
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//false
        // String 类final(public final class String),所以在堆内存有一个常量池中.
        System.out.println(s3 == s4);//true
        //比较字符串内容是否相同
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s4.equals(s3));//true
    }


}
