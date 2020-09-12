package com.youkeda;

public class Recoursive {
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return factorial(n-1)*n;
    }
    public static void main(String[] args) {
        int result=factorial(10);
        System.out.println(result);
    }
}
