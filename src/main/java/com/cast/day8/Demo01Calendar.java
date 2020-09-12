package com.cast.day8;

import java.util.Calendar;
import java.util.Date;

public class Demo01Calendar {
    /*
    Calendar类不能直接创建对象，通过Calendar rightNow = Calendar.getInstance();静态方法
    以获得此类型的一个通用的对象。Calendar 的 getInstance 方法返回一个 Calendar 对象，其日历字段已由当前日期和时间初始化
     */
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();
        System.out.println(rightNow/*.getTime()*/);
        int year = rightNow.get(Calendar.YEAR);//获取年
        System.out.println(year);

        int month = rightNow.get(Calendar.MONTH);//获取月份  西方的月份为0-11，东方为1-12
        System.out.println(month);

        int day1 = rightNow.get(Calendar.DAY_OF_MONTH);//获取本日位于本月的第几天
        int day2 = rightNow.get(Calendar.DATE);//同上
        System.out.println(day1);
        System.out.println(day2);

        int day_of_week = rightNow.get(Calendar.DAY_OF_WEEK);//获取本周位于本日的第几天
        System.out.println(day_of_week);
        //。。。
        System.out.println("==============");
        demo1();
        System.out.println("==============");

        demo2();

        System.out.println("===========");

        demo3();
    }

    private static void demo3() {
        Calendar c = Calendar.getInstance();

        Date time = c.getTime();//把日历对象转换为日期对象（Date）
        System.out.println(time);
    }

    private static void demo2() {
        /*
        public abstract void add(int field , int mount);
        把指定的增加或减少指定的值
         */
        Calendar c = Calendar.getInstance();//使用getInstance()方法获取对象名

        c.add(Calendar.YEAR,2);
        System.out.println(c.get(Calendar.YEAR));

    }

    private static void demo1() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,9999);
        c.set(Calendar.MONTH,11);//设置的月份超过11会自动模12，转换为相应的月份
        c.set(Calendar.DATE,31);
        int year = c.get(Calendar.YEAR);//获取年份
        System.out.println(year);

        int month = c.get(Calendar.MONTH);//获取月份  西方的月份为0-11，东方为1-12
        System.out.println(month);

        int day1 = c.get(Calendar.DAY_OF_MONTH);//获取本日位于本月的第几天
        int day2 = c.get(Calendar.DATE);//同上
        System.out.println(day1);
        System.out.println(day2);

        System.out.println("=============");

        c.set(2020,8,11);
        int year1 = c.get(Calendar.YEAR);//获取年份
        System.out.println(year1);

        int month1 = c.get(Calendar.MONTH);//获取月份  西方的月份为0-11，东方为1-12
        System.out.println(month1);

        int day3 = c.get(Calendar.DAY_OF_MONTH);//获取本日位于本月的第几天
        int day4 = c.get(Calendar.DATE);//同上
        System.out.println(day3);
        System.out.println(day4);
    }
}
