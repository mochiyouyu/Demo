package com.zzu.demo;

public class Add {
    public static void main(String[] args){
        int n=0;
        System.out.println(n);
        n++;
        System.out.println(n);
        System.out.println(n++);//单独使用，首先使用变量本来的数值，然后再让变量加1
        System.out.println(n);
        ++n;
        System.out.println(n);
        System.out.println(++n);//变量马上立刻加1，然后拿着结果进行运算
        --n;
        System.out.println(n);
        System.out.println(--n);
        n--;
        System.out.println(n);
        System.out.println(n--);
        System.out.println(n);
    }
}
