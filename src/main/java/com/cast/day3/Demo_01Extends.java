package com.cast.day3;

public class Demo_01Extends {
/*
super关键字的使用：
1.在子类的成员方法中，访问父类的成员变量
2.在子类的成员方法中，访问父类的成员方法
3.在子类的构造方法中，访问父类的构造方法
 */
    public static void main(String[] args) {
//        Fu fu = new Fu();
//        fu.method();
//        System.out.println(fu.numFu);
//        System.out.println("=========");
//        Zi zi = new Zi();
//        zi.method();
//        System.out.println("=========");
//        System.out.println(zi.numZi);
//        System.out.println(zi.numFu);
//        System.out.println("=========");
//        int num = 30;
//        System.out.println(num);
//        System.out.println(zi.num);//优先访问本例里面的成员变量
//        System.out.println("=========");
        Zi zi = new Zi();
        System.out.println(zi.num);
    }
}
