/*
指定考试成绩,判断成绩的等级.
90-100 优秀
80-89 好
70- 79 良
60-69 及格
60以下 不及格
*/
public class Demo02IfPractice{
	
	public static void main(String[] args){
		int score;
		score = 10;
		if (90 <= score && score <= 100){
			System.out.println("你的成绩属于优秀");
		}else if(80 <= score && score <= 89){
			System.out.println("你的成就属于好");
		}else if(70 <= score && score <= 79){
			System.out.println("你的成绩属于良");
		}else if(60 <= score && score <= 69){
			System.out.println("你的成就属于及格");
		}else if(0 <= score && score < 60){
			System.out.println("你的成绩属于不及格");
		}
		else{
			System.out.println("你输入的成绩是错误的");
		}
	}
		
	}