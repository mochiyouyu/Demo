package com.cast.day11.threadPool;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"在线程池中执行");
    }
}
