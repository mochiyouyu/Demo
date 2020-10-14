package com.cast.day14IO.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\a\\b.txt",true);//可以追加写入
        fos.write("你好".getBytes());
        fos.close();
    }
}
