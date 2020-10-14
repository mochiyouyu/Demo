package com.cast.day11.lambda;

public class LambdaDemo01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新的线程创建了.");
            }
        }).start();

        //使用Lambda表达式实现多线程
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"新的线程创建了");
        }).start();

        //优化省略
        new Thread(()-> System.out.println(Thread.currentThread().getName()+"新的线程创建了")).start();
    }
}
