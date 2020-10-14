package com.cast.day12File.digui;

public class DIGuiDemo01 {
    public static void main(String[] args) {
        /*b(1);*/
        int ss = sum(1000);
        System.out.println(ss);
        int num = jieCheng(5);
        System.out.println(num);
    }

    private static int sum(int i) {
        if (i == 1) {
            return 1;
        }
        return sum(i-1)+i;
    }

    private static int jieCheng(int num){
        if(num==1){
            return 1;
        }
        return num*jieCheng(num-1);
    }

}
