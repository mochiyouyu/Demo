package com.cast.day4.demo01;

public class MyinterfaceDefaultA implements MyinterfaceDefault{
    @Override
    public void methodA() {
        System.out.println("方法A");
    }

    @Override
    public void methodC() {
        System.out.println("实现类覆盖重写了默认方法");
    }
}
