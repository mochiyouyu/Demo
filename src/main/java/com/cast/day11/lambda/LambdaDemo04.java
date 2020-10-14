package com.cast.day11.lambda;

public class LambdaDemo04 {
    /*
    Lambda表达式：是可推导，可以省略
    凡是可以根据上下文 推导出来的内容都可以省略
    可以省略的内容：
        1.(参数列表)：括号中参数列表中的数据类型，可以省略不写
        2.(参数里表):括号中的参数如果只有一个，那么类型和()都可以省略
        3.(一些代码):如果{}中的代码只有一行，无论是否有返回值都可以省略({},return,;分号)
        注意：要省略{},，return，分号，必须一起省略
     Lambda使用前提：
     1.Lambda必须具有接口，且要求接口中仅有一个抽象方法
     使用Lambda必须具有上下文推断
     备注：有且仅有一个抽象方法的进口，称为:"函数式进口"
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        /*invokeCalc(a, b, new Calculator() {
            @Override
            public int cal(int a, int b) {
                return a+b;
            }
        });*/

        //使用Lambda表达式
        invokeCalc(a,b,(int c,int d)->{
            return c + d;
        });

        //优化省略Lambda
        invokeCalc(a,b,(c,d)->c + d);
    }

    private static void invokeCalc(int a,int b,Calculator calculator) {
        int sum = calculator.cal(a,b);
        System.out.println(sum);
    }
}
