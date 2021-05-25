package gouZaoFangFa;
/*
* g构造方法是专门用来创建对象的方法,当我们通过关键字new创建对象时,就是在调用构造方法.
* 格式:
* public 类名称(参数类型 参数名称){
* 方法体}
* 注意事项:
* 1.构造方法的名称必须和所在类的类名完全一致.
* 2.构造方法不要写返回类型,void也不行.
* 3.g构造方法不能return一个具体返回值
* 4.如果没有编写任何构造方法,那么编译器会默认一个构造方法,没有参数,方法什么事情都不做.
* 5.一旦编写了至少一个构造方法,编译器将不再赠送.
* 6.构造方法是可以overload.
* */
public class Student {
    //成员变量
    private String name;
    private int age;
    //无参数的构造方法
    public Student(){
        System.out.println("构造方法执行了");
    }

    //有参数的构造方法
    public Student(String name, int age){
        System.out.println("全参构造方法执行了");
        this.name = name;
        this.age = age;
    }
    //Getter and Setter
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
