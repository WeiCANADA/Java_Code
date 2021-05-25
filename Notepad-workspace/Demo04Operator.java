/*
取模：只用于对整数的除法取模
注意事项：
	1.运算当中有不同类型的数据，结果将会是数据类型范围大的那种。
	
	“+”的常见三种用法
	1.对于数值就是加法
	2.对于char类型来说，在计算前，char会被提升为int，然后在计算；
	3.对于字符串String（首字母大写，并不是关键字），“+”表示字符串连接操作
	4.任何字符类型和字符串进行连接的时候，结果都会变成字符串
*/
public class Demo04Operator{
	public static void main(String[] arsg){
		int x = 10;
		int y = 3;
		int result1 = x % y;
		System.out.println(result1);
		
		System.out.println("========="+"字符串plus");
		//字符串类型的变量基本使用方法
		//数据类型 变量名称 = 数据值；
		String str1 = "Hello";
		System.out.println(str1);	//hello
		System.out.println(str1+"World");
		System.out.println(str1 + 20);		//Hello20
		System.out.println(str1+20+30);		//Hello2030
		System.out.println(str1+(20+30));	//Hello50
	}
	
}