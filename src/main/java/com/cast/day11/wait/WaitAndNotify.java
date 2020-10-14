package com.cast.day11.wait;


public class WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();

        new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("顾客1告诉老板要的包子的种类和数量");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子做好了，顾客1拿到包子");
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("顾客2告诉老板要的包子的种类和数量");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子做好了，顾客2拿到包子");
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (obj){
                    System.out.println("告诉顾客包子做好了。");
                    //obj.notify(); //只能唤醒一个wait线程
                    obj.notifyAll();//可以同时唤醒所有wait的线程
                }
            }
        }.start();
    }
}
