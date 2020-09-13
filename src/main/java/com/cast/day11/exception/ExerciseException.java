package com.cast.day11.exception;

import java.util.Scanner;

public class ExerciseException {
    static String[] userNames={"张三","李四","王五"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String  userName = sc.next();
        checkName(userName);
    }

    /*private static void checkName(String userName) throws RegisterException {
        for (String name : userNames) {
            if(name.equals(userName))
                throw new RegisterException("亲,该用户名已经被注册");
        }
        System.out.println("注册成功");
    }*/

    private static void checkName(String userName) {//运行期异常(RunTimeException)无锡自己处理，Java JVM会帮助我们处理
        for (String name : userNames) {
            if(name.equals(userName))
                try {
                    throw new RegisterException("亲,该用户名已经被注册");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
        }
        System.out.println("注册成功");
    }
}
