package com.cast.day11.ThreadDemo;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setName("马东阳");
        new MyThread("戚文成").start();
        thread.start();/*
        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }*/
        System.out.println("当前正在执行的线程的名称:"+Thread.currentThread().getName());
    }
}
