package com.cast.day12File.fileDemo;

import java.io.File;
import java.io.FileFilter;

public class listFilesDemo04 {
    public static void main(String[] args) {
        File file = new File("D:\\a");
        listFilesDemo(file);
    }
    public static void listFilesDemo(File file){
        if(file==null||!file.exists())
            return;
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isDirectory())
                    return true;
                if(pathname.getName().endsWith(".chw")){
                    return true;
                }else{
                    return false;
                }

            }
        });
        if(files==null){
            return;
        }
        for (File file1 : files) {
            if(file1.isDirectory()){
                listFilesDemo(file1);
            }else{
                System.out.println(file1);
            }
        }
    }
}
