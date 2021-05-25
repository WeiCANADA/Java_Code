/*
当数据类型不一样时，将会发生数据类型转换
自动类型转换（隐式）
	1.特点：代码不需要进行特殊处理，自动完成；
	2.规则：数据范围从小到大。与数据类型占有的字节数不直接相关。
强制类型转换
	1.特点：代码需要进行特殊处理；
	2.格式：范围小的类型 范围小的变量名 = （范围小的类型）
	
注意事项：
	1.强制类型转换一般不推荐使用，因为有可能发生精度损失、数据溢出。
	2.byte/short/char类型都可以进行加法运算。
	3.运算的时候都会被提升为int类型，然后在计算。
*/
public class Demo01DataType{
	public static void main(String[] args){
		System.out.println(1024);//int
		System.out.println(3.14);//double
		
		//左面是long 类型，右边是默认int
		long num1 = 100L;
		long num2 = 100;//int类型100会自动转换为long类型
		System.out.println(num1);
		System.out.println(num2);
		
		double num3 = 2.005;		//float到double符合从小到大的规则 
		System.out.println(num3);
		
		float num4 = 10000L;	//long到float符合从小到大
		System.out.println(num4);
		
		
		System.out.println("===============");
		System.out.println("强制类型转换");
		int numA = (int) 100L;
		System.out.println(numA);
		
		int numB = (int) 6000000000L;//1705032704.发生数据溢出
		System.out.println(numB);
		
		int numC = (int) 3.5;
		System.out.println(numC);	//3
		
		System.out.println("===============");
		System.out.println("加法运算");
		char zifu1 = 'A';
		System.out.println(zifu1+1);	//66=65+1
		
		byte numD = 40;
		byte numF = 50;
		//byte + byte ---> int + int ---->int
		//byte result1= numD + numF;
		int result1= numD + numF;
		System.out.println(result1);
		
		short numG = 60;
		short result2= (short) (numG + numF);
		System.out.println(result2);
		
		
		
	}
}