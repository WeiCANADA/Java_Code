/*
ָ�����Գɼ�,�жϳɼ��ĵȼ�.
90-100 ����
80-89 ��
70- 79 ��
60-69 ����
60���� ������
*/
public class Demo02IfPractice{
	
	public static void main(String[] args){
		int score;
		score = 10;
		if (90 <= score && score <= 100){
			System.out.println("��ĳɼ���������");
		}else if(80 <= score && score <= 89){
			System.out.println("��ĳɾ����ں�");
		}else if(70 <= score && score <= 79){
			System.out.println("��ĳɼ�������");
		}else if(60 <= score && score <= 69){
			System.out.println("��ĳɾ����ڼ���");
		}else if(0 <= score && score < 60){
			System.out.println("��ĳɼ����ڲ�����");
		}
		else{
			System.out.println("������ĳɼ��Ǵ����");
		}
	}
		
	}