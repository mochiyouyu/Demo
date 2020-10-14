package com.cast.day12.fileDemo;

import java.io.File;

public class listFilesDemo02 {
    public static void main(String[] args) {
        File file = new File("D:\\");
        listFilesDemo(file);
    }
    public static void listFilesDemo(File file){
       /* System.out.println(file);*/
       /* if(!file.isHidden()){
            File[] files = file.listFiles();
            for (File file1 : files) {

                if(file1.isDirectory()){
                    listFilesDemo(file1);
                }else{
                    String name = file1.getName();
                    if(name.endsWith(".java")){
                        System.out.println(file1);
                    }
                }
            }
        }else{
            System.out.println("文件夹找不到!!!");
        }*/
        if(file==null||!file.exists()){
            return;
        }
        File[] files = file.listFiles();
        if(files==null){//此时如果使用数组长度是否为0对文件夹是否为空进行判断会报NullPointerException;
            return;
        }
        for (int i = 0; i < files.length; i++) {
            if(files[i].isHidden()){
                continue;
            }
            if(files[i].isDirectory()){
                listFilesDemo(files[i]);
            }else{
                String name = files[i].getName();
                if(name.endsWith(".java")){
                    System.out.println(files[i]);
                }
            }

        }

    }
}
