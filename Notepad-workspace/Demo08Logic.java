/*
�߼������
&&
||
!
"&&","||"���ж�·Ч��,�����������Ѿ������жϵõ����,��ô����Ĵ��뽫����ִ��.

ע������:
		1.�߼������ֻ������booleanֵ.
		2.&&\||��Ҫ���Ҹ�����һ��Booleanֵ,����ȡ��ֻ��ҪΨһ��һ��booleanֵ����.
*/
public class Demo08Logic{
	public static void main(String[] arsg){
		System.out.println(true && false);//false
		System.out.println(1 < 3 && 1 > 0);//true
		
		System.out.println(true || false);//false
		System.out.println(true || true);//true
		System.out.println(false || false);//false
		
		int a;
		int b;
		a = 10;
		b = 11;
		System.out.println(a < b && a < --b);//false
		System.out.println(b);//10
		System.out.println(a < b && a <= --b);//false
		//false&&..��ִ�к���
		System.out.println(b);//10
		System.out.println( !(a == b) || a <= --b);//false
		//false||falseִ�к���
		System.out.println(b);//9
		
		
	}
}