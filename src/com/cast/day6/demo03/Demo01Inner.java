package com.cast.day6.demo03;

public class Demo01Inner {
    public static void main(String[] args) {
        Outer outer=new Outer();
        System.out.println(outer.num);
        //调用内部类的方式：
        /*
       1. 在外部类里面初始化使用
       2. 格式：
        外部类.内部类 对象名 = new 外部类().new 内部类();
        然后就可以调用内部类的方法

        如果一个类定义在方法内部，则称为局部内部类，
        局部内部类只有当前方法才能使用，出了方法体就不能使用。
         */
        Outer.InnerClass inner=new Outer().new InnerClass();
        inner.method1();
    }
}
