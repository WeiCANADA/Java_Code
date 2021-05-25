package extendsStudy.extendsConstructor;
/*
* 继承中构造方法的访问特点:
* 1.子类Constructor中有一默认隐含的"super()"调用,所以一定是先调用父类Constr,后执行子类的Constructor.
* 2.可以通过super关键字来实现子类overload父类的Constructor
* 3.super的父类构造调用,必须是子类构造方法的第一个语句,子类构造方法只能调用一次super构造.
* 总结:
* 子类不许调用父类的构造方法,不写则赠送super(),写了则用写指定的super调用,super只能用一次,而必须放在第一句.
*
* super关键字的用法只有三种.
* 1.子类的方法调用父类的成员变量;
* 2.子类中调用父类的同名方法;
* 3.在子类的构造方法中调用父类的构造方法.默认有super();
*
* this关键字的三种用法
* 1.在本类方法中,方位本类成员变量.
* 2.在本类方法中,调用本类的成员方法.
* 3在本类的Constructor中,调用本类的另一个Constructor.
*
*
*
* */
public class Demo01Constructor {
    public static void main(String[] args) {
        Zi zi = new Zi();
        System.out.println(zi);//会自动调用父类的无参Constructor
        zi.methodB();

    }
}
