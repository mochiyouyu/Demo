package com.cast.day3;

public class Fu {//基类或者超类
    int numFu = 10;

    int num;

    public void method() {
        System.out.println("该方法执行了！！！");
    }

    public Fu(int num) {
        System.out.println("父类有参构造方法");
        this.num = num;
    }

    public Fu() {
        System.out.println("父类无参构造");
    }
}
