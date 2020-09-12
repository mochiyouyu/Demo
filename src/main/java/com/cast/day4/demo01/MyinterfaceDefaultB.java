package com.cast.day4.demo01;

public class MyinterfaceDefaultB implements MyinterfaceDefault{
    @Override
    public void methodA() {
        System.out.println("方法B");
    }

    @Override
    public void methodC() {
        System.out.println("实现类覆盖重写了默认方法");
    }
}
