package com.cast.day14.fileReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\a\\b.txt");
        FileReader fileReader = new FileReader(file);
        int len = 0;
        while ((len = fileReader.read())!=-1){
            System.out.print(len);
            System.out.println((char)len);
        }
        fileReader.close();
    }
}
