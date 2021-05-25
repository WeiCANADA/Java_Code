package study1;
/** 通常情况下,一个类并不能直接使用,需要根据类创建一个对象,才能使用.
 * 1.导包:指出需要使用的类在什么位置.
 * 格式:import 包名称,类名称;
 * import study1.Student;
 * 对于和当前类属性同一个包的情况,可以省略导语包.
 *
 * 2.创建对象:
 * 格式: 类名称 对象名 = new 类名称();
 * Student Student1 = new Student();
 *
 * 3.使用,分为两种情况:
 * 使用成员变量: 对象名,成员变量名
 * 使用成员方法:对象名,成员方法名
 *
*
* */
public class StudentDuiXiang {
    public static void main(String[] args) {
        //1.导包,我需要一个Student类,和我自己StudentDuiXiang 位于同一个包下,所以省略导语包不写
        // 2.创建,格式:
        //类名称 对象名= new 类名称();
        Student studentDuiXiang1 = new Student ();
        //3.使用其中的成员变量的格式: 对象名.成员变量
        System.out.println(studentDuiXiang1.name);
        System.out.println(studentDuiXiang1.age);

        studentDuiXiang1.name = "刘思坦";
        studentDuiXiang1.age = 5;
        System.out.println(studentDuiXiang1.name);
        System.out.println(studentDuiXiang1.age);

        //4.使用成员方法的格式: 对象名.成员方法();
        studentDuiXiang1.eat();
        studentDuiXiang1.sleep();
        studentDuiXiang1.study();

    }
}
