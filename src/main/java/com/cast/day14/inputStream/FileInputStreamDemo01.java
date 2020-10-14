package com.cast.day14.inputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\a\\d.txt");
        int read = fileInputStream.read();
        System.out.println(read);
        fileInputStream.close();
    }
}
