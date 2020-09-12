package com.cast.day2;

public class Demo_07Math {
    /*
    Math里面提供了大量的静态方法，可以完成与数学有关的运算
    public static double abs(double num); 获取绝对值
    public static double ceil(double num);向上取整
    public static double floor(double num);向下取整
    public static long round(double num);四舍五入
    Math.PI常量
     */
    public static void main(String[] args) {
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(-3.14));
        System.out.println(Math.abs(0));
        System.out.println("=============");
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(3.5));
        System.out.println(Math.ceil(3.0));
        System.out.println(Math.ceil(-3.1));
        System.out.println("==============");
        System.out.println(Math.floor(3.1));
        System.out.println(Math.floor(3.9));
        System.out.println(Math.floor(3.0));
        System.out.println(Math.floor(-3.1));
        System.out.println("=============");
        System.out.println(Math.round(3.1));
        System.out.println(Math.round(3.5));
        System.out.println(Math.round(3.0));
        System.out.println(Math.PI);
    }
}
