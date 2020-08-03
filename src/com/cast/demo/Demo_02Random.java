package com.cast.demo;

import java.util.Random;

/*
* 1.导包
* import java.util.Random;
* 2.创建
* Random random = new Random();
* 3.使用
* 获取一个随机的int类型数据（范围是int所有范围，包括正负）int num=random.nextInt();
* 获取一个随机的int数据，参数代表范围，左闭右开int num = random.next(3);
* */
public class Demo_02Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt();
        int num2 = r.nextInt(3);
        System.out.println(num1);
        System.out.println(num2);
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(100);
            System.out.println(num);
        }
    }
}
