package com.cast.day11ThreadAndException.lambda;

public class LambdaDemo02 {
    public static void main(String[] args) {
        invokeCook(()->{
            System.out.println("吃饭啦!");
        });

        //优化省略Lambda
        invokeCook(()-> System.out.println("吃饭啦!"));
    }

    private static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
