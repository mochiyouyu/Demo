package com.cast.day14IO.inputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\a\\d.txt");
        int len = 0;
        while ((len = fileInputStream.read()) != -1){
            System.out.println(len);
            System.out.println((char) len);
        }
        fileInputStream.close();
    }
}
