package extendsStudy;
/*
* 格式:
* public class 子类类名 extents 父类类名{
* ....
* }
* 继承中成员变量的访问特点:
* 1.直接通过子类对象访问成员变量:
*  "."左侧是谁就优先用谁的,,没有则向上找.
* 2.通过方法访问成员变量,调用谁的方法就用谁的,没有测向上找.
*
* //区分子类方法中重名的三种变量
* 局部变量: 直接写成员变量
* 本类成员变量: this.成员变量名
* 父类成员变量: super.成员变量名
* 继承中成员方法的访问特点:
* 创建的对象是谁 ,就优先用谁,如果没有则向上找.
*  注意事项:
*  无论是成员方法还是成员变量,如果没有都是向上找,不会向下找.
*
*  覆盖重写(Override)
*  概念:在继承关系当中,方法的名称相同,参数列表也相同.
*  注意事项:
*  1.必须保证父子类之间的方法名称相同,参数列表页相同.
*  @Override,写在方法前面,用来监测是不是有效的正确覆盖重写.
*  2.子类方法的返回值必须<小于等于父类>的方法的返回值范围.
*  Object 类是所有类的公共最高父类(祖宗类).
*  3.子类方法的返回值权限必须<大于等于>父类的权限范围.
*  public > protected > (default) > private.
* */

public class Demo01Extends {
    public static void main(String[] args) {
        int num = 31;
        Employee employee = new Employee();//创建Employee的一个对象employee
        Teacher teacher = new Teacher();//创建Teacher的一个对象 teacher

        teacher.method();//teacher对象所在子类中并无method方法 继承使用父类的method方法.

        //直接通过子类对象访问成员变量特点
        System.out.println(employee.num);//10
        System.out.println(teacher.num);//20
        System.out.println(num);        //30
        System.out.println(teacher.num1);// 11  teacher 对象所在类中无成员变量num1,故向上找到父类Employee里的num1变量.
        //父类和子类中重名方法的调用特点
        teacher.methodChongMing();
        employee.methodChongMing();
        //区分子类方法中重名的三种变量
        teacher.methodT();



    }
}
