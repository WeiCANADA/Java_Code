/*
格式
public static void 方法名(){
	方法体
}
注意事项:
方法名称的命名和变量一样,使用小驼峰.
	1.方法写在主函数之外;
	2.不能嵌套
	3.方法的先后顺序无所谓
	4.方法定义好了之后,不会执行,如果要想执行,一定要进行方法的[调用].
	
	方法的调用
	
	方法名();
*/
public class Demo01Method{
	public static void main(String[] args){
		cook();
		
	}
	//厨子
	public static void cook(){
		System.out.println("洗菜");
		System.out.println("切菜");
		System.out.println("炒菜");
		System.out.println("装盘");
	}
	
	//我
	public static void me(){
		System.out.println("吃");
		System.out.println("付账");
	}
	
	//farmer
	public static void farmer() {
		System.out.println("耕地");
		System.out.println("播种");
		System.out.println("收割");
		System.out.println("出售");
	}
	
	public static void bussessman(){
		System.out.println("收购");
		System.out.println("运输");
		System.out.println("出售");
	}

	
}	
