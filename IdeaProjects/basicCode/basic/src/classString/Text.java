package classString;
/*String �������ص�*/
public class Text {
    public static void main(String[] args) {
        char[] cha = {'a', 'b', 'c'};
        String s1 = new String(cha);
        String s2 = new String(cha);
        String s3 = "abc";
        String s4 = "abc";
        //�Ƚϵ�ַ�Ƿ���ͬ
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//false
        // String ��final(public final class String),�����ڶ��ڴ���һ����������.
        System.out.println(s3 == s4);//true
        //�Ƚ��ַ��������Ƿ���ͬ
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s4.equals(s3));//true
    }


}
