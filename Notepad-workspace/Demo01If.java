/*
顺序结构
判断语句
	1.if语句
	格式:if(关系表达式){
		语句体};
	执行流程
	.首先判断关系表达式看其结果是True or false
	 如果是true 就执行语句体;
	 如果是false 就跳出大括号;
	 
	 2.if...else
	 格式:if(){
		 语句体1
	 }
	 else{
		语句体2
	 }
	 
	 3.if...else if...if
	 格式
	 if(判断条件1){
		 执行语句;
	 }else if(判断语句2){
		 执行语句2;
	 }else if(判断条件3){
		 执行语句3;
	 }else{
		 执行语句N+1;
	 }
	
*/
public class Demo01If{
	public static void main(String[] args){
		System.out.println("If 语句");
		System.out.println("今天天气不错,我在大街上压马路,突然一个网吧出现在我的右边");
		int age = 18;
		if(age > 16){
			System.out.println("登记上网");
			System.out.println("遇到一群猪队友");
			System.out.println("生气,结账走人");
			
		}
		System.out.println("继续压马路.");
		
		System.out.println("If...else 语句示例");
		//判断给定的数据是奇数还是偶数
		//定义变量
		int x = 2;
		if(x % 2 == 0){
			System.out.println(x + "是偶数");
		}
		else{
			System.out.println(x + "是奇数");
		}
		System.out.println("If...else if... else 语句示例");
			/*
			若果a>10,y=2a;
			如果1<= a <= 10 y=a+2;
			如果x<1 y=a-2;
			*/
			int y;
			int a;
			a = 5;
			if(a > 10){
				y = 2 * a;
				printZ();
				System.out.println(y);
			}else if(1 <= a && a <= 10){
				y = a + 2;
				printZ();
				System.out.println(y);
			}
			else{
				y = a - 2;
				printZ();
				System.out.println(y);
			}
	}
	public static void printZ(){
		System.out.println("y的值:");
	}
}