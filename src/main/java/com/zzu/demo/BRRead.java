package com.zzu.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void main(String[] args) {
        char c='y';
        //使用System.in创建BufferedReader
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下'q'健退出");
        //读取字符
        do{
            try {
                c=(char)br.read();
                System.out.println(c);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }while(c !='q');

    }
}
