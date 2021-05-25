/*
常量：在程序运行期间，固定不变的量。
常量的分类：
1.字符串常量，凡是用双引号引起来的部分，叫做字符串常量，
2.整数常量：直接写上的数字
3.浮点数常量：
4.字符常量：凡是用单引号引起来的单个字符，
5.布尔常量：true\false
6.空常量：null。代表没有任何数据。

*/
public class Demo01Const{
	public static void main(String[] args){
		//字符串常量
		System.out.println("abc");
		System.out.println("");//字符串连个引号中间的内容为空
		System.out.println("XYZ");
		
		//整数常量 
		System.out.println(2);
		System.out.println(100);
		
		//浮点数常量
		System.out.println(2.5);
		System.out.println(-100.73);
		
		//字符常量
		System.out.println('A');
		System.out.println('8');
		//System.out.println('');
		//System.out.println('AB');
		
		//布尔常量
		System.out.println(true);
		System.out.println(false);
		
		//空常量不能直接用来打印输出
		//System.out.println(null);
	}
}