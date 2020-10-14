package com.cast.day13ThreadExercise;

public class Operation {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result1 = add(a, b);
        int result2 = sub(a, b);
        double result3 = mul(a, b);
        double result4 = div(a, b);
        System.out.println("a与b的和是:" + result1);
        System.out.println("a与b的差是:" + result2);
        System.out.println("a与b的积是:" + result3);
        System.out.println("a与b商是:" + result4);
    }

    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    public static double mul(int a, int b) {
        double result = a * b;
        return result;
    }

    public static double div(int a, int b) {
        double result = a / b;
        return result;
    }
}
