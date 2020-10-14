package com.cast.day14.inputStreamReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src\\main\\java\\com\\cast\\day14\\outputStreamWriter\\b.txt"),"gbk");
        int len = 0;
        while ((len = isr.read())!=-1){
            System.out.println((char) len);
        }
    }
}
