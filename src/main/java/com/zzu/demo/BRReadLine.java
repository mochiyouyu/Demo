package com.zzu.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLine {
    public static void main(String[] args) {
        String str="";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter lines of text");
        System.out.println("Enter 'end' to quit");
        do{
            try {
                str=(String)br.readLine();
                System.out.println(str);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }while(!str.equals("end"));
    }
}
