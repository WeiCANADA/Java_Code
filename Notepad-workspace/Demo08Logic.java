/*
逻辑运算符
&&
||
!
"&&","||"具有短路效果,如果根据左边已经可以判断得到结果,那么右面的代码将不再执行.

注意事项:
		1.逻辑运算符只能用于boolean值.
		2.&&\||需要左右各自有一个Boolean值,但是取反只需要唯一的一个boolean值即可.
*/
public class Demo08Logic{
	public static void main(String[] arsg){
		System.out.println(true && false);//false
		System.out.println(1 < 3 && 1 > 0);//true
		
		System.out.println(true || false);//false
		System.out.println(true || true);//true
		System.out.println(false || false);//false
		
		int a;
		int b;
		a = 10;
		b = 11;
		System.out.println(a < b && a < --b);//false
		System.out.println(b);//10
		System.out.println(a < b && a <= --b);//false
		//false&&..不执行后半句
		System.out.println(b);//10
		System.out.println( !(a == b) || a <= --b);//false
		//false||false执行后半句
		System.out.println(b);//9
		
		
	}
}