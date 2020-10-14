package com.cast.day14IO.fileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\main\\java\\com\\cast\\day14\\fileWriter\\a.txt");
        FileWriter fw = new FileWriter(file);
        String str = "你好";
        fw.write(str);
        fw.flush();
        fw.write("\r\n");
        char[] chars = {'你','好'};
        fw.write(chars);
        fw.flush();
        fw.close();
    }
}
