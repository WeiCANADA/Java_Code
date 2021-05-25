package abstractStudy.form;
/*
* 抽象方法:
* 格式:方法加上 abstract 关键字,去掉大括号,直接分号结束;
* 抽象类:
* 格式:在class前写上 abstract 即可.
* 注:
* 1.抽象方法所在的类,必须是抽象类才行,而抽象类不一定有抽象方法;
* 2.抽象类不能直接创建对象,只能创建其非抽象类的子类之后,才能创建子类的对象
* 3.抽象类中,可以有构造方法,是供给子类创建对象,初始化父类成员使用的.
* 4.抽象类的子类,必须覆盖重写父类中所有抽象方法,除非该子类也是抽象类.
*
*
* 使用抽象类步骤:
* 1.创建一个子类继承抽象方法
* 2.覆盖重新抽象父类所有的抽象方法.
* 3.创建子类对象使用
*
* */
public abstract class Animal {
    //这是一个抽象方法,代表吃东西,但具体是什么不确定.
    public abstract void eat();
    public abstract void sleep();

    //这是一个普通方法
    public void normalMethod(){

    }
}
