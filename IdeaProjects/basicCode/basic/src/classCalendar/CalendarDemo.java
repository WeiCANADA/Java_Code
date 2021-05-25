package classCalendar;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //��ȡ����
        Calendar c = Calendar.getInstance();
        //����1: ��ȡ��ǰ������
//public int get(int field)
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DATE);
        System.out.println(year + "��" + month + "��" + day + "��");

        //����2: 1��ǰ��5��ǰ
        //public abstract void add(int field,int amount)
        c.add(Calendar.YEAR, -1);
        c.add(Calendar.DATE, -5);
        int year1 = c.get(Calendar.YEAR);
        int month1 = c.get(Calendar.MONTH) + 1;
        int day1 = c.get(Calendar.DATE);
        System.out.println(year1 + "��" + month1 + "��" + day1 + "��");

        //����3 ���õ�ǰ������Ϊ2100��3��3��
        //public final void set(int year,int month,int date)
        c.set(2100, 03, 03);
        int year2 = c.get(Calendar.YEAR);
        int month2 = c.get(Calendar.MONTH);
        int day2 = c.get(Calendar.DATE);
        System.out.println(year2 + "��" + month2 + "��" + day2 + "��");

        //����4 ��ȡ����һ��Ķ������ж�����
        int inputYear = 2020;
        c.set(inputYear, 2, 1);
        c.add(Calendar.DATE, -1);
        //test ���������Ƿ�ɹ�
        int year3 = c.get(Calendar.YEAR);
        int month3 = c.get(Calendar.MONTH);
        int day3 = c.get(Calendar.DATE);
        System.out.println(year3 + "��" + month3 + "��" + day3 + "��");
        int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(inputYear + "��Ķ�����" + dayOfMonth + "��");
    }
}
