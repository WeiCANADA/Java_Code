package classCalendar;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //获取对象
        Calendar c = Calendar.getInstance();
        //需求1: 获取当前年月日
//public int get(int field)
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + day + "日");

        //需求2: 1年前的5天前
        //public abstract void add(int field,int amount)
        c.add(Calendar.YEAR, -1);
        c.add(Calendar.DATE, -5);
        int year1 = c.get(Calendar.YEAR);
        int month1 = c.get(Calendar.MONTH) + 1;
        int day1 = c.get(Calendar.DATE);
        System.out.println(year1 + "年" + month1 + "月" + day1 + "日");

        //需求3 设置当前年月日为2100年3月3日
        //public final void set(int year,int month,int date)
        c.set(2100, 03, 03);
        int year2 = c.get(Calendar.YEAR);
        int month2 = c.get(Calendar.MONTH);
        int day2 = c.get(Calendar.DATE);
        System.out.println(year2 + "年" + month2 + "月" + day2 + "日");

        //需求4 获取任意一年的二月天有多少天
        int inputYear = 2020;
        c.set(inputYear, 2, 1);
        c.add(Calendar.DATE, -1);
        //test 日期设置是否成功
        int year3 = c.get(Calendar.YEAR);
        int month3 = c.get(Calendar.MONTH);
        int day3 = c.get(Calendar.DATE);
        System.out.println(year3 + "年" + month3 + "月" + day3 + "日");
        int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(inputYear + "年的二月有" + dayOfMonth + "天");
    }
}
