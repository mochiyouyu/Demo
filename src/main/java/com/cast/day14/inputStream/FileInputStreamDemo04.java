package com.cast.day14.inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\a\\d.txt");
        byte[] bytes = new byte[5];
        int len = 0;
        while ((len = fileInputStream.read(bytes)) != -1){
            System.out.println(len);
            System.out.println(Arrays.toString(bytes));
            System.out.println(new String(bytes,0,len));
        }

        fileInputStream.close();
    }
}
