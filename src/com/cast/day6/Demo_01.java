package com.cast.day6;

//final用来修饰一个类
/*
final类表示当前类不能有任何子类
其中的所有成员方法都不能进行覆盖重写
final方法不能进行任何覆盖重写
对于类、方法来说，abstract和final关键字不能同时出现，矛盾
final的用法
1.可以用来修饰一个类
2.可以用来修饰一个方法
3.可以用来修饰一个局部变量
4.可以用来修饰一个成员变量


 */
public final class Demo_01 {

    public static void main(String[] args) {
        Student stu1 = new Student("小明", 12);
        System.out.println(stu1.getName() + " " + stu1.getAge());
        stu1 = new Student("张三", 13);
        System.out.println(stu1.getName() + " " + stu1.getAge());

        final Student stu2 = new Student("小红", 12);
        System.out.println(stu2.getName() + " " + stu2.getAge());
//        stu2=new Student();错误，不可变，地址不可变，但是内容可边
        stu2.setAge(11);
        System.out.println(stu2.getName() + " " + stu2.getAge());
        System.out.println("============");
        MyClass myClass = new MyClass();
        System.out.println(myClass.num);
        System.out.println("===========");
        System.out.println(new MyClass().num);
    }
}
