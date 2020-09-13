package com.cast.day11.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExceptionDemo {
    public static void main(String[] args){
        try {
            demo("d:\\15997835152735d62e9b2adfe5da5924830f65c7bc763.png");
        } catch (IOException e) {
           /* System.out.println("文件的后缀名不对");*/
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());
            //System.out.println(e);
            e.printStackTrace();
        } finally {
            System.out.println("释放资源");
        }
        System.out.println("后续代码");
    }

    private static void demo(String fileName) throws IOException{
        if(!fileName.endsWith("jpg"))
            throw new IOException("文件的后缀名不对");
        if (!fileName.equals("d:\\15997835152735d62e9b2adfe5da5924830f65c7bc763.jpg"))
            throw new FileNotFoundException("传递的文件路径不是d:\\15997835152735d62e9b2adfe5da5924830f65c7bc763.jpg");//抛出异常(编译期出现的异常必须自己处理，可以通过throws处理异常或者通过try...catch处理异常) ,throws抛出的异常由调用者处理

        System.out.println("路径没有问题，读取文件");
    }
}
