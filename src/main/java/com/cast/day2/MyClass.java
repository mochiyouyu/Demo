package com.cast.day2;

public class MyClass {
    //成员变量
    int num;
    //静态变量
    static int numStatic;
    //成员方法
    public void method(){
        System.out.println("这是一个普通的成员方法!");
        System.out.println(num);//成员方法可以访问成员变量
        System.out.println(numStatic);//成员方法可以访问静态变量
    }
    //静态方法
    public static void staticMethod(){
        System.out.println("这是一个静态方法。");
        System.out.println(numStatic);//静态方法可以访问静态变量
        //System.out.println(num); 静态方法不可以访问非静态变量
    }
}
