package com.cast.day11ThreadAndException.ThreadDemo;

public class SleepDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
