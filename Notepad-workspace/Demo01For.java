/*
循环语句
基本组成部分,一般可以分为四个部分:
初始化语句
条件判断:成立则循环继续,不成立,循环退出;
循环体
步进语句:每次循环之后都要进行的扫尾工作,每次循环都要执行一次.
1.for循环
for(初始化表达式1;布尔表达式2;步进表达式4){
	循环体3
}
执行流程
1234>234>234...2不满足为止.

while 循环体
格式:
	标准格式:
		while(条件判断){
			循环体;
		}
	拓展格式:
		初始化语句;
		while(条件判断){
			循环体;
			步进语句;
		}
	
do...while语句
	格式:
		初始化表达式;
		do{
			循环体;
			步进表达式;
		}while(布尔表达式);
*/
public class Demo01For{
	public static void main(String[] args){
		for(int i = 1;i <= 10;i++){
			System.out.println(i + ":" + "我错了!");
		}
		System.out.println("程序停止");
		
		System.out.println("While 循环示例");
		int i = 1;
		while(i <= 10){
			System.out.println(i + ":" + "我错了!");
			i++;
		}
		
		System.out.println("do...While 循环示例");
		
		int a = 1;
	do{
		System.out.println(a  + ":" + "我错了!");
		a ++;
	}while(a <= 10);
	}
}