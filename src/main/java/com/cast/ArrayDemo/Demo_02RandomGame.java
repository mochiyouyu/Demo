package com.cast.ArrayDemo;

import java.util.Random;
import java.util.Scanner;

public class Demo_02RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int random = r.nextInt(10);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你猜测的数字：");
            int guessNum = sc.nextInt();
            if (guessNum == random) {
                System.out.println("恭喜您，猜对了！！！");
                break;
            } else if (guessNum > random) {
                System.out.println("很遗憾，猜大了");
            } else {
                System.out.println("很遗憾，猜小了");
            }
        }
    }

}
