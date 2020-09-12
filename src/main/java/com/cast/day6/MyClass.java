package com.cast.day6;

public class MyClass {
    protected int num = 10;//public可以访问  //protected可以访问  //（default）不写可以直接访问  //private不可以直接访问

    public void methodA() {
        System.out.println("方法A");
    }
}
