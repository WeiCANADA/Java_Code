package extendsStudy.extendsConstructor;

public class Zi extends Fu{
    int a = 10;

    public Zi(){

        //super();//JDK默认赠送
        super(20);//super 关键字调用父类重载构造.

        int a = 11;
        System.out.println("子类构造方法!");
        System.out.println(a);
        System.out.println(this.a);//this第一中用法 .用来调用本类的成员变量
        System.out.println(super.a);//super第一中用法 .用来调用父类的成员变量
    }
    public void methodA(){
        System.out.println("A方法");
    }
    public  void methodB(){
        this.methodA();//用this调用A方法,主要为强调A方法为本类的方法
        System.out.println("B方法");
    }
}
