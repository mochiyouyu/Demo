package com.cast.day14IO.fileReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo04 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\a\\f.txt");
        FileWriter fw = new FileWriter(file);
        String str = "你好";
        fw.write(str);
        fw.flush();
        char[] chars = {'你','好'};
        fw.write(chars);
        fw.flush();
        fw.close();
    }
}
