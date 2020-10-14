package com.cast.day14.inputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo05 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\a\\d.txt");
        FileOutputStream fos = new FileOutputStream("D:\\a\\e.txt");
        byte[] bytes = new byte[3];
        int len = 0;
        while ((len = fileInputStream.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fileInputStream.close();
    }
}
