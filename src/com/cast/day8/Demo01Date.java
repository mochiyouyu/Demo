package com.cast.day8;

import java.util.Date;

public class Demo01Date {
    /*
    Date时间就是从1970年1月1日 00:00:00（英国格林威治时间）算起，中国属于东八区，时间加上8小时。
     */
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取系统当前时间 就是从1970年1月1日 00:00:00 到现在一共经历的时间多少毫秒
        demo01();
        demo02();
        demo03();
    }

    private static void demo03() {
        Date date4 = new Date();
        long time1 = date4.getTime();
        System.out.println(time1);//获取当前时间的毫秒值，冲1970 1月1日 08:00:00开始
    }

    private static void demo02() {
        Date date2 = new Date(0L);//传递毫秒数，把毫秒数转换为日期，
        Date date3 = new Date(1597068391428L);
        System.out.println(date2);
        System.out.println(date3);
    }

    private static void demo01() {
        Date date1 = new Date();
        System.out.println(date1);
    }
}
