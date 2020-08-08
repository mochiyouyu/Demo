package com.cast.day5;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("狗吃馒头");
    }

    public void watchHouse() {
        System.out.println("狗看家");
    }
}
