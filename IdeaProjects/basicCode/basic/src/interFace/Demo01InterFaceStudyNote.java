package interFace;
/*
* 接口是一种引用数据类型,最重要的内容就是其中的:抽象方法.
*   格式:
*       public interface 接口名称{
*           接口内容
*       }
*   接口使用步骤:
     1.接口不能直接使用,必须有一个"实现类"来实现接口.
        格式:
        public class 实现类名称 implements 接口名称{
        //.....
        }
    2.创建实现类的对象,进行使用.

接口方法:
    1.抽象方法
        格式:public abstract 返回值类型, 方法名称(参数列表);
    备注:
       1.修饰符固定是public abstract,但可以有选择的省略
       2.抽象方法三要素随意定义.
使用方法:
   1.接口中创建abstract方法
   2.实现类中必须Override接口中所有的abstract方法
    格式:去掉abstract 关键字,加上方法体大括号
   3.对象类中被调用


 2 默认方法
    格式
        public default 返回值类型 方法名称(参数列表){
            方法体
        }
 默认方法的使用
    1.接口中创建default方法
    2.实现类中Override default方法//可选步骤
    3.对象类中被调用,对象名称.default方法名();
备注:1.可以解决接口升级的问题.具体为在接口中添加default方法后,实现类里,不用Override default 方法也不会报错.

 3 static 方法
    格式: public static 返回值类型 方法名(){
        //方法体
        }
    调用方法
        1.接口中创建static方法
        2.对象类中直接调用
           格式:接口名称.static方法名();.

 4.private 方法,java9 以后支持.

 5.定义成员变量
  格式:public static final 数据类型 成员变量名 = 数据值;
  注意事项:
      1.其中public static final 可以省略.
      2.接口中的常量必须赋值;
      3.接口中的常量名称,使用完全大写的字母,用下划线进行分割.推荐使用

  6.接口使用的注意事项:
    1.接口是没有静态代码块或者构造方法的;
    2.一个实现类可以同时实现多个接口;
        格式: public class MyInterfaceImpl implement MyInterfaceA, MyInterfaceB{
        //body
        }
    3.如果实现类中所实现的接口有个多个,并存在重名的抽象方法,只需要覆盖重写一次.
    4.如果实现类没有覆盖所有抽象方法,那么实现类就必须是一个抽象类.
    5.如果实现类实现多个接口方法,存在重复的默认方法,那么实现类必须Override默认方法.
    6.一个类中,直接父类中的方法,和接口当中的默认方法产生了冲突,优先用父类当中的方法.




*/
public class Demo01InterFaceStudyNote {
}
