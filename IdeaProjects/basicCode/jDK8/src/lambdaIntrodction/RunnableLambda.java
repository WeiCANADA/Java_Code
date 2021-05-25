package lambdaIntrodction;

/*
 * lambda 表达式是一个匿名函数,
 * (参数列表) -> { 方法体 };
 * */
public class RunnableLambda {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("新线程执行代码啦!")).start();
    }
}
