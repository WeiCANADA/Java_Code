package exceptionStudy;

public class Teacher {
    public void checkScore(int score) throws Exception{
        if(score < 0 || score > 100){
            throw new ScoreException("������0~100֮�������");
        }else{
            System.out.println("��������");

        }
    }
}
