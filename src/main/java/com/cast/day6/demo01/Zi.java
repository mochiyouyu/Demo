package com.cast.day6.demo01;

import com.cast.day6.MyClass;
//子类与父类不在同一个包里面就需要导包
public class Zi extends MyClass {
    public void methodB(){
        System.out.println(super.num);  //public 可以访问  //protected 可以访问  //default不可以访问  //private 不可以访问
    }
}
