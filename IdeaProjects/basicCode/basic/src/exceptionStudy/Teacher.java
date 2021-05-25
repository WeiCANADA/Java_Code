package exceptionStudy;

public class Teacher {
    public void checkScore(int score) throws Exception{
        if(score < 0 || score > 100){
            throw new ScoreException("请输入0~100之间的整数");
        }else{
            System.out.println("分数正常");

        }
    }
}
