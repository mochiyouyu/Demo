package com.cast.day14.bufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedWriter fw = new BufferedWriter(new FileWriter("src\\main\\java\\com\\cast\\day14\\bufferedWriter\\a.txt"));
        for (int i = 0; i < 10; i++) {
            fw.write("你好，再见");
            /*fw.newLine();*/
            fw.write("\r\n");
        }
        fw.flush();//把数据刷新到文件，可以继续写入文件
        fw.close();//把数据刷新到文件并释放资源
    }
}
