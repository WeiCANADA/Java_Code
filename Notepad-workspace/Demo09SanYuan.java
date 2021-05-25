/*
一元运算符 如"!","++","--"
二元运算符
三元运算符

三元运算符格式:
数据类型 变量名称 = 条件判断? 表达式A: 表达式B;

流程:
首先判断条件是否成立
如果成立为true,那么表达式A的值赋值给左侧的变量;
如果不成立为false,那么将表达式B的值赋值给左侧的变量;

注意事项:
1.必须同时保证表达式A和表达式都符合左侧数据类型的要求;S\s\
2.三元运算符的结果必须被使用

*/
public class Demo09SanYuan{
	public static void main(String[] arsg){
		int a;
		int b;
		int max;
		a = 10;
		b = 20;
		max = a > b ? a : b;
		System.out.println("最大值:" + max);
		
	}
}