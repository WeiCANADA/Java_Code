/*
˳��ṹ
�ж����
	1.if���
	��ʽ:if(��ϵ���ʽ){
		�����};
	ִ������
	.�����жϹ�ϵ���ʽ��������True or false
	 �����true ��ִ�������;
	 �����false ������������;
	 
	 2.if...else
	 ��ʽ:if(){
		 �����1
	 }
	 else{
		�����2
	 }
	 
	 3.if...else if...if
	 ��ʽ
	 if(�ж�����1){
		 ִ�����;
	 }else if(�ж����2){
		 ִ�����2;
	 }else if(�ж�����3){
		 ִ�����3;
	 }else{
		 ִ�����N+1;
	 }
	
*/
public class Demo01If{
	public static void main(String[] args){
		System.out.println("If ���");
		System.out.println("������������,���ڴ����ѹ��·,ͻȻһ�����ɳ������ҵ��ұ�");
		int age = 18;
		if(age > 16){
			System.out.println("�Ǽ�����");
			System.out.println("����һȺ�����");
			System.out.println("����,��������");
			
		}
		System.out.println("����ѹ��·.");
		
		System.out.println("If...else ���ʾ��");
		//�жϸ�������������������ż��
		//�������
		int x = 2;
		if(x % 2 == 0){
			System.out.println(x + "��ż��");
		}
		else{
			System.out.println(x + "������");
		}
		System.out.println("If...else if... else ���ʾ��");
			/*
			����a>10,y=2a;
			���1<= a <= 10 y=a+2;
			���x<1 y=a-2;
			*/
			int y;
			int a;
			a = 5;
			if(a > 10){
				y = 2 * a;
				printZ();
				System.out.println(y);
			}else if(1 <= a && a <= 10){
				y = a + 2;
				printZ();
				System.out.println(y);
			}
			else{
				y = a - 2;
				printZ();
				System.out.println(y);
			}
	}
	public static void printZ(){
		System.out.println("y��ֵ:");
	}
}