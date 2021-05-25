package stringStudy;
/*
* public void str.length()//获取字符串长度
* public int str.indexOf(String partOfString);//返回指定字符在此字符串中第一次出现处的索引。
* public String str.concat(String str)//将指定字符串连接到此字符串的结尾
* public String substring(int beginIndex)//返回一个新的字符串，它是此字符串的一个子字符串
* public String substring(int beginIndex, int endIndex ) [);
* public char[] toCharArray();将字符串转换成字符数组
* public byte[] getBytes();使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
* public String replace(CharSequence target, CharSequence replacement)
* public String[] split(String regex)
*regex 是正则表达是,英文符号无法直接风格.以后学习.
 * */

public class TheMethodsOfStringClass {
    public static void main(String[] args) {
        String str = "Grace,I Love You Dear ";
        String str1 = "Hello";
        String str2 = "world";
        System.out.println(str.length());
        int num = str.indexOf("w");
        System.out.println(num);
        String str3 = str2.concat(str2);
        System.out.println(str3);
        String str4 = str.substring(6);
        System.out.println(str4);
        String str5 = str.substring(6,17);
        System.out.println(str5);
        char[] char1 = str.toCharArray();//toCharArray
        System.out.println(char1[0]);
        System.out.println(char1.length);
        byte[] bytes = str.getBytes();//getBytes
        System.out.println(bytes);
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        String str6 = str.replace("o","8");//replace
        System.out.println(str6);
        String[] stringArray = str.split(",");//split
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);

        }
        String str7 = "aaa,bbb,ccc";
        String[] stringArray1 = str7.split("\\,");//split//正则表达式.
        for (int i = 0; i < stringArray1.length; i++) {
            System.out.println(stringArray1[i]);
        }

    }
}
