package com.zzu.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入:");
//        if(sc.hasNext()){
//            String str1=sc.next();
//            System.out.println(str1);
//        }
        if (sc.hasNextLine()){
            String str2=sc.nextLine();
            System.out.println(str2);
        }
        sc.close();
    }
}
