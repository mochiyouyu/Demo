package com.cast.day11ThreadAndException.test;

public class BaoZiPu extends Thread {
    private BaoZi bz;

    private int count = 0;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.isFlag()) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count % 2 == 0) {
                    bz.setPi("薄皮");
                    bz.setXian("三鲜馅");
                } else {
                    bz.setPi("冻皮");
                    bz.setXian("猪肉大葱");
                }
                count++;
                System.out.println("包子铺正在生产" + bz.getPi() + bz.getXian() + "包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.setFlag(true);
                bz.notify();
            }
        }
    }
}
