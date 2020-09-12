package com.cast.day4.demo02;

public interface MyinterrfacePrivateA {
    //私有方法经略默认方法中的代码重复问题
    public default void methodA() {
        System.out.println("默认方法1");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
    }

    public default void methodB() {
        System.out.println("默认方法2");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
    }

}
