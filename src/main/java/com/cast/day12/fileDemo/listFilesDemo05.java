package com.cast.day12.fileDemo;

import java.io.File;
import java.io.FilenameFilter;

public class listFilesDemo05 {
    public static void main(String[] args) {
        File file = new File("D:\\a");
        listFilesDemo(file);
    }

    public static void listFilesDemo(File file) {
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isDirectory() || name.endsWith(".chw");
            }
        });
        for (File file1 : files) {
            if (file1.isDirectory()) {
                listFilesDemo(file1);
            } else {
                System.out.println(file1);
            }
        }
    }
}
