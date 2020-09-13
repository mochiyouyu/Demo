package com.cast.day11.ThreadDemo;

public class MyThread extends Thread{

    public MyThread(){

    }
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        /*for (int i = 0; i < 20; i++) {
            System.out.println("run:"+i);
        }*/
        System.out.println(getName());
    }
}
