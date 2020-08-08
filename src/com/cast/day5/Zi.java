package com.cast.day5;

public class Zi extends Fu {
    int num = 10;

    @Override
    public void method() {
        System.out.println("子类方法");
    }

    public void showNum() {
        System.out.println(num);
    }

    public void methodA() {
        System.out.println("子类的方法");
    }
}
