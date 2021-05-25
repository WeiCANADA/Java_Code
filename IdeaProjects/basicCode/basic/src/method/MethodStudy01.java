package method;
/*
方法:若干语句的功能集合

参数(原料)
返回值(产出物)

格式:
修饰符 返回值类型 方法名称(参数类型 参数名称,...){
方法体
return 返回值;

修饰符: 现阶段的固定写法,public static
返回值类型:也就是方法最终产生的数据结果是什么类型
方法名称:规则和变量一样,小驼峰
参数类型:进入方法的数据是什么类型
参数名称:进入方法的数据对应的变量名称
return:两个作用,第一个停止当前方法,第二讲后面的返回值还给调用处
返回值:也就是方法执行后最终产生的数据结果

NOTE: return 后面的"返回值",必须和方法名前面的"返回值类型",保持一致.

定义一个两个int 数相加的方法.三要素:
返回值类型:int
方法名:sum
参数列表:int a , int b


方法的三种调用格式
1.单独调用: 方法名称();
2.打印调用:
3.复制调用

NOTE: 1.void 只能单独调用,不能赋值调用和打印调用.
      2.如果方法有返回值,必须写上"return返回值;"
      3.return后面的返回数据,不许和方法的返回值类型保持一致.
      4.对于方法中最后一行的return可以省略不写;
      5.对于一个void 方法,可以有多个return,表示中断方法执行.
      6.一个方法中可以有多个return语句,但是必须保证同时只有一个返回值.
}
*/
public class MethodStudy01 {
    public static void main(String[] args) {
//     单独调用
        sum(10,20);
//        打印调用
        System.out.println(sum(5,6));
//     赋值调用
        int num;
        num = sum(20,30);
        System.out.println("变量值" + num);
    }
    public static int sum(int a,int b){
        int result;
        result = a + b;
        return result;
    }

    }
