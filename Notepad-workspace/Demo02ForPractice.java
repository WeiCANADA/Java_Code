/*
	求出1-100之间偶数和
*/
public class Demo02ForPractice{
	public static void main(String[] args){
	int sum = 0;
	for(int i =1;i <=100;i++){
		if(i % 2 == 0){
		sum += i;
		}
	}
	System.out.println("结果是" + sum);
	}
}