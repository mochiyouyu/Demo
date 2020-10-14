package com.cast.day14IO.outputStreamWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWritterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream("src\\main\\java\\com\\cast\\day14\\outputStreamWriter\\a.txt"),"utf-8");//指定文件的写入编码类型
        os.write("你好");
        os.flush();
        os.close();

    }
}
