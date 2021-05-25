package stringStudy;
/*
* "==" 是进行 对象地址的比较,如果需要对字符串的内容比较,可以使用两个方法:
*第一种方法:
* public boolean equals(Object obj):参数可以是任何对象,只有参数是一个字符串并且内容相同才会给true,否则返回false
* 注意事项:
* 1.任何对象都能用Object 进行接收
* 2.equals 方法具有对称性,a.equals(b)和b.equals(a)一样;
* 3.如果 比较双方一个常量一个变量,推荐把常量字符串写在前面.
* 第二种方法:
* public boolean equalsIgoreCase(String str):忽略大小写进行比较.
*
*
* */


public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] charArray1 = new char[] {'h', 'e', 'l', 'l', 'o'};
        //第一种方法
        String str3 = new String(charArray);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
        System.out.println(str2.equals("Hello"));
        System.out.println("Hello".equals(str3));
        System.out.println("Hello".equals(charArray1));//false

        //第二种方法
        String str4 = new String(charArray1);
        System.out.println("Hello".equalsIgnoreCase(str4));//true
    }
}
