/*基本数据类型
整数型 byte short int long
浮点型 float double
字符型 char
布尔型 boolean
引用数据类型
字符串、数组、类、接口、lambda
注意事项：
1.字符串不是基本类型
2.浮点型可能只是一个近似值，并非精确值
3.数据范围与自己数不一定相关
4.浮点数中默认类型double，如果一定要用float类型，需要加上一个后缀F
5.如果是整数，默认是int类型，如果要long，需要加上一个后缀L。

变量：程序运行期间，内容可以发生改变的量。

创建一个变量并且使用的格式：
数据类型 变量名称；//创建了一个变量
变量名称 =数据值； //赋值
一步到位的格式：
数据类型 变量名称 = 数据值；
*/
public class Demo02Variable{
	public static void main(String[] args){
		int num1;
		num1=10;
		System.out.println(num1);
		num1=20;
		System.out.println(num1);
		System.out.println("===========");
		byte num2=30;
		System.out.println(num2);
		
		short num3=50;
		System.out.println(num3);
		
		long num4=3000000000L;
		System.out.println(num4);
		
		float num5=2.5F;
		System.out.println(num5);
		
		double num6=22.2;
		System.out.println(num6);
		
		char zifu1 = 'A';
		System.out.println(zifu1);
		zifu1='中';
		System.out.println(zifu1);
		
		boolean var1 = true;
		System.out.println(var1);
		
	}
}