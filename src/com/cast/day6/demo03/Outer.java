package com.cast.day6.demo03;

public class Outer {
    int num = 10;

    class InnerClass {
        int num = 20;
        public void method1() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }
}
