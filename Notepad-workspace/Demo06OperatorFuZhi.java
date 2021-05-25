/*
赋值运算符:
基本运算符：”=“
符合运算符：
+= 			a += 3   相当于a = a + 3
-=			a -= 3		相当于a = a - 3
/=
%=

注意事项:
		1.只有变量才能使用赋值运算符;
		2.复合运算符中隐藏一个强制类型转换;
*/
public class Demo06OperatorFuZhi{
	public static void main(String[] arsg){
		int a = 10;
		a += 5;
		System.out.println(a);
		
		int x = 10;
		x %=3;
		System.out.println(x);
		
	}
}