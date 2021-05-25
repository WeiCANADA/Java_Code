package classfengZhuang;
/*
* 定义person的年龄时候,无法阻止不合理的数值被设置进来
* 解决方法,用private 关键字将需要保护的成员变量进行修饰.
* 一旦使用了private 进行修饰,那么奔雷当中任然可以访问,
* 但是,超出本类范围之外就不能直接访问了.
* 间接访问private成员变量,就需要定义一对 getter/setter方法.
* */
public class FengZhuang_Private1 {
    public static void main(String[] args) {
        FengZhuang_Private person = new FengZhuang_Private();
        person.show();

        person.name = "刘思坦";
      //  person.age = 3;//直接访问private 内容,错误写法!
        person.setAge(-12);
        person.show();
        person.setAge(12);
        person.show();




    }
}
