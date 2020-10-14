package com.cast.day14.fileReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo03 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\a\\b.txt");
        FileWriter fw = new FileWriter(file);
        fw.write(97);//fileWriter中的write方法是把数据写入内传中，然后通过flush方法把数据刷新到硬盘
        fw.flush();//把数据刷新到硬盘
        fw.write("你好");
        fw.flush();
        fw.close();
    }
}
