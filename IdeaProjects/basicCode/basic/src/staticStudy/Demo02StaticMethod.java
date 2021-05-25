package staticStudy;

public class Demo02StaticMethod {
    public static void main(String[] args) {
        Myclass obj = new Myclass();//先创建对象
        //然后才能使用没有static关键字的内容
        obj.method();
        //对于静态方法来说,推荐直接通过类名称来调用.
        obj.methodStatic();//不推荐
        Myclass.methodStatic();
        //对于本来当中的静态方法,可以省略类名称
        myMethod();
    }
    public static void myMethod(){
        System.out.println("This is my own method");
    }
}
