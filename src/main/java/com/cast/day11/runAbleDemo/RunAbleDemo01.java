package com.cast.day11.runAbleDemo;

public class RunAbleDemo01 {
    /*
    使用Runnable创建多线程的原因:
    1.避免了单继承的局限性
    2.增强了程序的扩展性，降低了程序的耦合性(解耦)
        把设置线程任务和开启新的线程进行了分离(解耦)
     */
    public static void main(String[] args) {
     /*   RunnableImpl runnable = new RunnableImpl();
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }*/

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(currentThread().getName()+"-->"+i);
                }
            }
        }.start();

        Runnable r = new Runnable(){

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+i);
                }
            }
        };
        new Thread(r).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+i);
                }
            }
        }).start();
    }
}
