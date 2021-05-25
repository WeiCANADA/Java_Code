package classInteger;
/*String 与 int 的转换*/
public class Test {
    public static void main(String[] args) {
        //int --> String
        int i = 100;
        //way1
        String str = "" + i;//非正规方式
        System.out.println(str);
        //way2
        String str1 = String.valueOf(i);
        System.out.println(str);;
        //String -->int
        String str2 = "101";
        //public static int parseInt(String s)
        int i2 = Integer.parseInt(str2);
        System.out.println(i2);
        //String --> Integer -->int
        //public static Integer valueOf(String s)
        Integer in1 = Integer.valueOf(str2);
        int i4 = in1.intValue();
        //public int intValue()
        System.out.println(i4);
    }
}
