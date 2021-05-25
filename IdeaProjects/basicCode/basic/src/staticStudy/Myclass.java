package staticStudy;

/*注意事项:
* 1.静态不能直接方位非静态
* 原因:在内存中,先有静态变量,后又非静态内容.
* 2.静态方法中不能使用this 关键字
* 原因:在静态方法调用的时候,实际使用的是被调用类的名称,而this是指当前对象里的变量.
* */
public class Myclass {
    int num;
    static int numStatic;
    public void method(){
        System.out.println("这是一个成员方法");
        System.out.println(num);
        System.out.println(numStatic);
    }
    public static void methodStatic(){
        System.out.println("这是一个静态方法");
        System.out.println(numStatic);
        //System.out.println(num);//错误,静态方法不能访问非静态方法.
        //System.out.println(this);错误.在静态方法调用的时候,实际使用的是被调用类的名称,而this是指当前对象里的变量.
    }
}
