package com.cast.day12File.fileDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        System.out.println(file.getPath());
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
        File file1 = new File(absolutePath);
        String name1= file1.getName();
        System.out.println(name1);
        File file2 = new File("D:\\IDEA\\Demo");
        String name2 = file2.getName();//返回由此File表示的文件或目录的名称，获取的就是File构造方法传递的路径的结尾部分
        System.out.println(name2);
        long l1 = file.length();//获取文件的大小，以字节为单位
        System.out.println(l1);
        /*System.out.println(file2.length());*/ //文件夹是没有大小的，不能用来获取文件夹的大小
        System.out.println(file1.length());
        File file3 = new File("c.txt");
        System.out.println(file3.length()); //如果文件不存在，那么length返回0
        System.out.println(file3.exists()); //判断构造方法中的路径或文件是否存在
        System.out.println(file3.isDirectory()); //判断file3表示的是否为目录
        System.out.println(file3.isFile());//判断file3是否为文件
        System.out.println(file.exists());
        System.out.println(file2.isDirectory());
        System.out.println(file.isFile());
        boolean index = file3.createNewFile();//只能创建文件，不能创建文件夹，相对路径、绝对路径都能创建
        System.out.println(index);
        File file4 = new File("ddd");
       /* boolean b1 = file4.mkdir();
        System.out.println(b1);*/  //只能创建单级文件夹
        /*boolean delete = file4.delete();
        System.out.println(delete);*/
        File file5 = new File("111\\222\\333\\444");
       /* boolean mkdirs = file5.mkdirs();
        System.out.println(mkdirs);*/
        /*boolean delete = file5.delete();
        System.out.println(delete);*/
    }
}
