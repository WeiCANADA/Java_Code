package classStringBuilder;
/*
StringBuilder ���췽��:
* public StringBuilder()����һ�������κ��ַ����ַ��������������ʼ����Ϊ 16 ���ַ���
* public StringBuilder(String str)����һ���ַ���������������ʼ��Ϊָ�����ַ������ݡ����ַ����������ĳ�ʼ����Ϊ 16 �����ַ��������ĳ��ȡ�
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
        //��ʽ���
        sb.append(1).append(2).append(3).append("!");
        System.out.println(sb);
        //String ��StringBuilder �����໥ת��
        String sb2 =sb.toString();//StringBuilder --> String
        String sb3 = "Hello Java";
        StringBuilder sb4 = new StringBuilder(sb3);
        System.out.println(sb2 + sb4);
    }
}
