package com.cast.day14IO.bufferedFileOutputStream;

import java.io.*;

public class bufferedFileOutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("src\\main\\java\\com\\cast\\day14\\bufferedFileOutputStream\\a.txt"));
        BufferedInputStream bis = new BufferedInputStream(fis);
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            System.out.println(len);
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
        bis.close();
    }
}
