/*������������
������ byte short int long
������ float double
�ַ��� char
������ boolean
������������
�ַ��������顢�ࡢ�ӿڡ�lambda
ע�����
1.�ַ������ǻ�������
2.�����Ϳ���ֻ��һ������ֵ�����Ǿ�ȷֵ
3.���ݷ�Χ���Լ�����һ�����
4.��������Ĭ������double�����һ��Ҫ��float���ͣ���Ҫ����һ����׺F
5.�����������Ĭ����int���ͣ����Ҫlong����Ҫ����һ����׺L��

���������������ڼ䣬���ݿ��Է����ı������

����һ����������ʹ�õĸ�ʽ��
�������� �������ƣ�//������һ������
�������� =����ֵ�� //��ֵ
һ����λ�ĸ�ʽ��
�������� �������� = ����ֵ��
*/
public class Demo02Variable{
	public static void main(String[] args){
		int num1;
		num1=10;
		System.out.println(num1);
		num1=20;
		System.out.println(num1);
		System.out.println("===========");
		byte num2=30;
		System.out.println(num2);
		
		short num3=50;
		System.out.println(num3);
		
		long num4=3000000000L;
		System.out.println(num4);
		
		float num5=2.5F;
		System.out.println(num5);
		
		double num6=22.2;
		System.out.println(num6);
		
		char zifu1 = 'A';
		System.out.println(zifu1);
		zifu1='��';
		System.out.println(zifu1);
		
		boolean var1 = true;
		System.out.println(var1);
		
	}
}