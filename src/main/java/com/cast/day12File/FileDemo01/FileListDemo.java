package com.cast.day12File.FileDemo01;

import java.io.File;
import java.io.IOException;

public class FileListDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ASUS");
        /*boolean wq = file.mkdirs();*/
        /*boolean wq = file.createNewFile();*/
       /* System.out.println(wq);*/
        String[] list = file.list();//返回一个String数组，表示该file目录中的所有子文件或目录是file的相对路径
        for (String s : list) {
            System.out.println(s);
        }

        File[] files = file.listFiles();//返回一个file数组表示该File目录中的所有的子文件或者目录，是文件的绝对路径
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
