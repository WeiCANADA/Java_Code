package threadDemo.treadJoin;
//public final void join() throws InterruptedException
public class TreadJoinTest {
    public static void main(String[] args) {
        //创建线程
        ThreadJoin TJ = new ThreadJoin("李渊");
        ThreadJoin TJ2 = new ThreadJoin("李世民");
        ThreadJoin TJ3 = new ThreadJoin("李元霸");

        //启动线程
        TJ.start();
        //设置join
        try {
            TJ.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TJ2.start();
        TJ3.start();
    }
}
