package com.cast.day4.demo01;

public class Demo_01implements {
    public static void main(String[] args) {
        MyinterfaceAbstractImpl interface1=new MyinterfaceAbstractImpl();
        interface1.methodA();
        interface1.methodB();
        interface1.methodC();
        interface1.methodD();
        MyinterfaceDefaultA interface2=new MyinterfaceDefaultA();
        interface2.methodA();//调用抽象方法，实际运行的是右侧的实现类。
        interface2.methodC();//调用默认方法，如果实现类中没有，会向上找接口
        MyinterfaceStaticImpl interface3=new MyinterfaceStaticImpl();
//        interface3.methodA(); //错误写法
        //正确写法，直接通过接口名称进行调用
        MyinterfaceStatic.methodA();
    }
}
