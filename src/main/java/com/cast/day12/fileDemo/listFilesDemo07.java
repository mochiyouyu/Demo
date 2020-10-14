package com.cast.day12.fileDemo;

import java.io.File;

public class listFilesDemo07 {
    public static void main(String[] args) {
        File file = new File("D:\\a");
        listFilesDemo(file);
    }
    public static void listFilesDemo(File file){
        System.out.println(file);
        File[] files = file.listFiles((File d,String name)->{
            return new File(d,name).isDirectory() || name.endsWith(".chw");
        });
        for (File file1 : files) {
            if(file1.isDirectory()){
                listFilesDemo(file1);
            }else{
                System.out.println(file1);
            }
        }
    }
}
