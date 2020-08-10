package com.cast.day6.demo02;

public class Demo_02 {
    public static void main(String[] args) {
        Body body=new Body();
        body.move();
        System.out.println("============");
        //按照公式：
        /*
        调用内部类创建对象:
        外部类.内部类 对象名 = new 外部类().new 内部类();
         */
        Body.Heart heart=new Body().new Heart();
        heart.beat();
    }
}
