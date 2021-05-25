/*
自增运算符：++
自减运算符：--
单独使用：前++or后加++无区别；
混合使用：
	A:如果是前++，变量【立刻+1】然后拿着结果进行使用，【先加后用】
	B:如果是后++，首先使用变量本来的数值，然后再让变量+1，【先用后加】
	
注意事项：只有变量才能使用“++”、“--”。
*/
public class Demo05OperatorPlus{
	public static void main(String[] arsg){
		int num1=10;
		System.out.println(num1);//10
		num1++;
		System.out.println(num1);//11
		++num1;
		System.out.println(num1);//12
		
		System.out.println("=======混合使用");
		int num12 = 20;
		System.out.println(num12);//20
		System.out.println(num12++);//20
		System.out.println(num12);//21
		
		int num13 = 30;
		System.out.println(num13);//30
		System.out.println(++num13);//31
		System.out.println(num13);//31
	}
}