package com.cast.day6.demo03;

public class MyOuter {
    public void methodF() {
        class inner {
          final int num = 20;//如果不写final必须保证num保持不变
//        num = 10; 局部内部类，如果希望所在方法的局部变量，那么这个局部变量必须是【有效的final】
/*
原因：
1.new出来的对象在堆内存里面
2.局部变量跟着方法走，在栈E内存里面
3.方法运行完之后就会立刻出栈，局部变量会立刻消失
4.但是new出来的对象会在堆里面持续存在
 */
            public void method() {
                System.out.println(num);
            }


        }

    }
}
