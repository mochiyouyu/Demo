package com.cast.day3;

public class Zi extends Fu {
    /*
    局部变量 直接写
    子类的成员变量 this.成员变量
    父类的成员变量 super.成员变量
     */
    /*
        方法覆盖重写的注意事项：
        1.必须保证父子类的方法名称相同，参数列表也相同
        2.子类方法的返回值必须小于等于父类方法的返回值的覆盖范围
        3.子类方法的修饰权限必须大于等于父类的修饰权限修饰符
        提示;public > protected > (default) > private
        (default)不是关键是而是留空
     */


    /*
    继承关系中父子类构造方法的访问特点：
    1.子类方法中先有一个默认的super()调用
    2.可以通过super关键字来子类构造调用父类重载方法
    3.super的父类构造调用，必须 是子类构造调用的第一个语句，不能一个子类构造调用多次super构造
    总结：
    子类必须调用父类构造发方法，不写则赠送super(),写了则用指定的super()调用，还必须是第一个。
     */


    int numZi = 20;
//
//    int num = 20;

    @Override  //不写也是正确的覆盖重写
    public void method() {
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }

    public Zi() {
//        super();
        super(10);
//        super();
        System.out.println("子类构造方法");
    }
}
