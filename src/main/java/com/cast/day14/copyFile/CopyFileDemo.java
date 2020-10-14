package com.cast.day14.copyFile;

import java.io.*;

public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        test01();
        test02();
        test03();
    }
    public static void test01() throws IOException {
        File file = new File("C:\\Users\\ASUS\\Pictures\\huiyi\\1E680F82898F9A73CA0FB93187340B0F.jpg");
        File file1 = new File("src\\main\\java\\com\\cast\\day14\\copyFile\\copy01.jpg");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(file1);
        int len = 0;
        long time1 = System.currentTimeMillis();
        while((len = fis.read()) != -1){
            fos.write(len);
        }
        fis.close();
        fos.close();
        long time2 = System.currentTimeMillis();
        System.out.println("一个字节一个字节复制所需要的时间:"+(time2-time1));
    }

    public static void test02() throws IOException {
        File file = new File("C:\\Users\\ASUS\\Pictures\\huiyi\\1E680F82898F9A73CA0FB93187340B0F.jpg");
        File file1 = new File("src\\main\\java\\com\\cast\\day14\\copyFile\\copy02.jpg");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(file1);
        byte[] bytes = new byte[1024];
        int len = 0;
        long time1 = System.currentTimeMillis();
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
        long time2 = System.currentTimeMillis();
        System.out.println("以数组的形式复制所需要的时:"+(time2-time1));
    }
    public static void test03() throws IOException {
        File file = new File("C:\\Users\\ASUS\\Pictures\\huiyi\\1E680F82898F9A73CA0FB93187340B0F.jpg");
        File file1 = new File("src\\main\\java\\com\\cast\\day14\\copyFile\\copy03.jpg");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(file1);
        BufferedInputStream bio = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int len = 0;
        long time1 = System.currentTimeMillis();
        while((len = bio.read()) != -1){
            bos.write(len);
        }
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
    }

}
