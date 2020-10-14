package com.cast.day12.fileDemo;

import java.io.File;
import java.io.FileFilter;

public class listFilesDemo06 {
    public static void main(String[] args) {
        File file = new File("D:\\a");
        listFilesDemo(file);
    }
    public static void listFilesDemo(File file){
        File[] files = file.listFiles((File pathname)->{
            return pathname.getName().toLowerCase().endsWith(".chw") || pathname.isDirectory();
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
