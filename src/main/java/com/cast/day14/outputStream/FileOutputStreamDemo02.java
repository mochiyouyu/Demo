package com.cast.day14.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\a\\b.txt");
        byte[] bytes = "你好".getBytes();
        System.out.println(Arrays.toString(bytes));
        fos.write(bytes);
        fos.close();
    }
}
