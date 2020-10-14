package com.cast.day14IO.bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\com\\cast\\day14\\bufferedWriter\\a.txt"));
        String line = null;
        while ((line = br.readLine()) !=null){
            System.out.println(line);
        }
    }
}
