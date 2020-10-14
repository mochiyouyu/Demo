package com.cast.day11ThreadAndException.runAbleDemo;

//使用锁对象来解决

//使用同步方法来解决线程安全问题

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//使用lock所锁
public class Ticket implements Runnable{
    /*
    程序频繁的判断锁、获取锁、释放锁，程序的效率会降低
     */
    Lock lock =new ReentrantLock();

    private static int ticketNum = 1000;
    /*Object obj = new Object();*/
    @Override
    public void run() {
        while (true){
            //synchronized (obj){
            lock.lock();
                if(ticketNum>0){
                    System.out.println(Thread.currentThread().getName()+"正在售票:"+ticketNum);
                    ticketNum--;
                }
            lock.unlock();
            //}
            /*PayTicket();*/
            /*PayTicketStatic();*/
        }
    }
    //创建一个同步方法
    //锁对象是this，及创建的对象
    public synchronized void PayTicket(){
        if(ticketNum>0){
            System.out.println(Thread.currentThread().getName()+"正在售票:"+ticketNum);
            ticketNum--;
        }
    }

    //创建一个静态方法
    //锁的对象是本类的class属性-->class文件对象
    //静态方法优先于对象
    public static synchronized void PayTicketStatic(){
        if(ticketNum>0){
            System.out.println(Thread.currentThread().getName()+"正在售票:"+ticketNum);
            ticketNum--;
        }
    }
}
