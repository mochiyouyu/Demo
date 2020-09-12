package com.cast.day8;

public class Demo04System {
    /*
    System.currentTimeMillis()方法可与用来测试程序的效率
    arrayopy()方法的参数C
    src - 源数组。
    srcPos - 源数组中的起始位置。
    dest - 目标数组。
    destPos - 目标数据中的起始位置。
    length - 要复制的数组元素的数量。

     */
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("本次循环用时:"+(e-s)+"毫秒");
        int[] src = {1,2,3,4,5};
        int[] dest = {7,8,9,10,11};
        System.arraycopy(src,0,dest,0,3);
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }
    }
}
