/*
���������Ͳ�һ��ʱ�����ᷢ����������ת��
�Զ�����ת������ʽ��
	1.�ص㣺���벻��Ҫ�������⴦���Զ���ɣ�
	2.�������ݷ�Χ��С��������������ռ�е��ֽ�����ֱ����ء�
ǿ������ת��
	1.�ص㣺������Ҫ�������⴦��
	2.��ʽ����ΧС������ ��ΧС�ı����� = ����ΧС�����ͣ�
	
ע�����
	1.ǿ������ת��һ�㲻�Ƽ�ʹ�ã���Ϊ�п��ܷ���������ʧ�����������
	2.byte/short/char���Ͷ����Խ��мӷ����㡣
	3.�����ʱ�򶼻ᱻ����Ϊint���ͣ�Ȼ���ڼ��㡣
*/
public class Demo01DataType{
	public static void main(String[] args){
		System.out.println(1024);//int
		System.out.println(3.14);//double
		
		//������long ���ͣ��ұ���Ĭ��int
		long num1 = 100L;
		long num2 = 100;//int����100���Զ�ת��Ϊlong����
		System.out.println(num1);
		System.out.println(num2);
		
		double num3 = 2.005;		//float��double���ϴ�С����Ĺ��� 
		System.out.println(num3);
		
		float num4 = 10000L;	//long��float���ϴ�С����
		System.out.println(num4);
		
		
		System.out.println("===============");
		System.out.println("ǿ������ת��");
		int numA = (int) 100L;
		System.out.println(numA);
		
		int numB = (int) 6000000000L;//1705032704.�����������
		System.out.println(numB);
		
		int numC = (int) 3.5;
		System.out.println(numC);	//3
		
		System.out.println("===============");
		System.out.println("�ӷ�����");
		char zifu1 = 'A';
		System.out.println(zifu1+1);	//66=65+1
		
		byte numD = 40;
		byte numF = 50;
		//byte + byte ---> int + int ---->int
		//byte result1= numD + numF;
		int result1= numD + numF;
		System.out.println(result1);
		
		short numG = 60;
		short result2= (short) (numG + numF);
		System.out.println(result2);
		
		
		
	}
}