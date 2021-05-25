package threadDemo.threadGroup;

public class EscapeSequencesTest {
    public static void main(String[] args) {
        System.out.println("Hello" + "\b" + "Java");//HellJava
        System.out.println("Hello" + "\t" + "Java");//Hello	Java
        System.out.println("Hello" + "\n" + "Java");//Hello
                                                    //Java
        System.out.println("Hello" + "\r" + "Java");//java
        System.out.println("Hello" + "\"" + "Java" + "\"");//"HellJava"
        System.out.println("Hello" + "\\" + "Java");//Hello\Java
        System.out.println("Hello" + "'" + "Java" + "'" );
    }
}
