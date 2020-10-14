package com.cast.day11.test;

public class ChiHuo extends Thread {
    private BaoZi bz;

    public ChiHuo(BaoZi bz){
        this.bz = bz;
    }

    @Override
    public void run() {
        while(true){
            synchronized (bz){
                if (!bz.isFlag()){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("包子生产好了，开始吃"+bz.getPi()+bz.getXian()+"的包子");
                bz.setFlag(false);
                bz.notify();
            }
        }
    }
}
