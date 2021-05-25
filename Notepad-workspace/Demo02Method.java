public class Demo02Method{
	public static void main(String[] args){
		short num1 = 10; //正确写法,右侧int没有超出左侧short 的范围
		
		short a = 5;
		short b = 8;
		//short + short -->int + int -->int
		//short result = a + b;//错误写法!左侧需要是int类型
		int result = a + b;
		 short result1 = 5 + 7;
		 /*再给变量进行赋值的时候,如果右侧表达式宕渣全都是常量,
		 没有任何变量,那么编译器javac 将直接若干个常量表达式计算得到结果.short result = 5 + 8;
		 在class 文件中直接就是 short result = 13;*/
		 System.out.println(result);
		 System.out.println(result1);
	}
}