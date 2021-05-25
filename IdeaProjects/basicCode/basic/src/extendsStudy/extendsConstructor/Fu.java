package extendsStudy.extendsConstructor;

public class Fu {
    int a = 10;
    public Fu(){
        this(10);//this 可以用来调用本类中的其他的Constructor
        System.out.println("父类无参构造方法执行");

    }
    public Fu(int a){

        System.out.println("父类有参构造方法执行");
    }
}
