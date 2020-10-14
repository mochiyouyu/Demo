package com.cast.day14IO.inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\a\\d.txt");
        byte[] bytes = new byte[7];
        int read = fileInputStream.read(bytes);
        System.out.println(read);
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));
        System.out.println(new String(bytes,1,4));
        fileInputStream.close();
    }
}
