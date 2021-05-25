/*
switch 语句
格式:
switch(表达式){
	case 常量1:
	语句体;
	break;
	case 常量2:
	语句体;
	break;
	...
	defaut:
	语句体n+1;
	break;
	
	Switch 注意事项
	1.多个case后面的数值不可以重复.
	2.Switch 后面的小括号当中只能是下列数据类型:
	基本数据类型:byte/short/int/char
	引用数据类型:String字符串\enum枚举
	3.switch语句可以很灵活:前后顺去可以颠倒,而且break语句可以省略.
	匹配哪一个case就从哪里往下执行,知道遇到了break或执行完毕.
}
*/
public class Demo01Switch{
	public static void main(String[] args){
		int num;
		num = 8;
		switch(num){
			case 1:
			System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tuesday");
			break;
			case 3:
			System.out.println("Wednesday");
			break;
			case 4:
			System.out.println("Thursday");
			break;
			case 5:
			System.out.println("Friday");
			break;
			case 6:
			System.out.println("Saturday");
			break;
			case 7:
				System.out.println("Sunday");
			default:
				System.out.println("输入的数据不正确");
			break;
		}
	}
}