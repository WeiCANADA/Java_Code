package scannerAndAPI;
import java.util.Scanner;//1.导包
/*
* Scanner类的功能,可以实现键盘输入数据,到程序当中.
* 引用类型的一般步骤
* 1.导包
* import 包路径.类名称;
* 2.创建对象
* 类名称 对象名 = new 类名称();
* 3.使用
* 对象名.成员方法();
*
* 获取键盘输入的一个int 数字: int num = sc.nextInt();
* 获取键盘输入的一个字符串: String str = sc.next();
* */
public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//2.创建对象
        int num = sc.nextInt();
        System.out.println("输入的数字是" + num);
        String str = sc.next();
        System.out.println("输入的字符串是" + str);
    }

}
