package com.cast.day4.demo01;

public interface MyinterfaceDefault {
    //第一个方法
    public abstract void methodA();
    //第二个方法
//    public abstract void methodB();
    //新添加的方法改为默认方法
    public default void methodC(){
        System.out.println("新添加的方法改为默认方法");
    }
}
