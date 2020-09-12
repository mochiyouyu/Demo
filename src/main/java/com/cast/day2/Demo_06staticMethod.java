package com.cast.day2;

public class Demo_06staticMethod {
    /*
    静态方法不属于对象，而是属于类的
    静态变量也是通过类名称.静态变量调用和赋值
    1.静态只能访问静态，不能直接访问非静态
    这是因为在内存中【先】有静态变量，【后】有非静态变量
    2.静态方法当中不能用this。
    因为this代表当前对象，通过谁调用的方法，谁就是当前变量
     */
    public static void main(String[] args) {
        MyClass obj=new MyClass();//首先创建对象
        obj.method();//对于没有static修饰的方法，必须先创建对象才能调用
        //对于静态方法可以通过对象调用，也可以通过类名 进行调用
        obj.staticMethod();//正确，但不推荐
        MyClass.staticMethod();//正确，推荐

        //下面两个完全等效
        Demo_06staticMethod.myMethod();
        myMethod();
    }
    public static void myMethod(){
        System.out.println("自己的方法");
    }
}
