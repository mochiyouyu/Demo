package com.cast.day2;
//计算-10.8到5.9之间绝对值大于6或小于2.1的整数有多少个
public class Demo_08MathExercise {
    public static void main(String[] args) {
        int count=zhengAbs(-10.8,5.6);
        System.out.println(count);
    }
    public static int zhengAbs(double num1,double num2){
        int start= (int) Math.ceil(num1);
        int end= (int) Math.floor(num2);
        int countNum=0;
        for (int i = start; i <=end ; i++) {
            if(Math.abs(i)>6||Math.abs(i)<2.1){
                countNum++;
            }
        }
        return countNum;
    }
}
