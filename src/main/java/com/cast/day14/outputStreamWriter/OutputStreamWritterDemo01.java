package com.cast.day14.outputStreamWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWritterDemo01 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream("src\\main\\java\\com\\cast\\day14\\outputStreamWriter\\b.txt"),"gbk");//指定文件的写入编码类型,在IDE里面打开是乱码，因为IDE默认写入打开编码是UTF-8
        os.write("你好");
        os.flush();
        os.close();

    }
}
