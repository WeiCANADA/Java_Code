package threadDemo.ThreadYield;
//public static void yield()
public class ThreadYieldTest {
    public static void main(String[] args) {
        ThreadYield a = new ThreadYield("A");
        ThreadYield b = new ThreadYield("B");
        a.start();
        b.start();
    }
}
