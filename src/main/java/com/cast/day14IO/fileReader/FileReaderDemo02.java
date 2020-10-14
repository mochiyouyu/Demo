package com.cast.day14IO.fileReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo02 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\a\\b.txt");
        FileReader fileReader = new FileReader(file);
        char[] chars = new char[1024];
        int len = 0;
        while ((len = fileReader.read(chars))!=-1){
            System.out.print(len);
            System.out.println(new String(chars,0,len));
        }
        fileReader.close();
    }
}
