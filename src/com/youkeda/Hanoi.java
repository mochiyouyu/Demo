package com.youkeda;

public class Hanoi {
    public static void move(int id,char x,char y){
        System.out.println(id+"号盘子从"+x+"移动到"+y);
    }
    public static void powerOfHanoi(int n,char x,char y,char z){
        if(n==0){
            return;
        }
      powerOfHanoi(n-1,x,z,y);//先将n-1个在A柱上的盘子经过C柱移动到B柱上
      move(n,x,z);               //再将A柱上编号为n的盘子移动到B柱上
      powerOfHanoi(n-1,y,x,z);//再将B柱上的n-1个盘子经过A柱移动到C柱上
    }
    public static void main(String[]args){
        powerOfHanoi(5,'A','B','C');
    }
}
