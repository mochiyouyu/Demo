package com.cast.day13ThreadExercise;

public class OperationThread {
    public static void main(String[] args) {
        int a = 10;
        int b = 5; Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                /*try {
                    Thread.sleep(1);*/
                int result2 = a - b;
                System.out.println("a与b的差是:"+result2);
                /*} catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            }
        };
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                try {
                    int result1 = a + b;
                    System.out.println("a与b的和是:"+result1);
                    Thread.sleep(1000);
                    new Thread(runnable2).start();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(runnable1).start();
    }
}
