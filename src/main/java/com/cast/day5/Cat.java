package com.cast.day5;

public class Cat implements  Animal{

    public void catchMouse() {
        System.out.println("猫捉老鼠");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
