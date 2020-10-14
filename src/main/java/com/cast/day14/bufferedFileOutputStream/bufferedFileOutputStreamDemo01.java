package com.cast.day14.bufferedFileOutputStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class bufferedFileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("src\\main\\java\\com\\cast\\day14\\bufferedFileOutputStream\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(fos);//可以提高写入效率
        //BufferedOutputStream(fos,int size);size指定缓冲流内部缓冲区的大小
        bos.write("我把数据写入到缓冲区了".getBytes());//数据在内存中，通过flush方法刷新
        bos.flush();
        bos.close();
    }
}
