package com.cast.day14IO.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\a\\a.txt");
        /*fos.write(1234);*/
        byte[] bytes = {34,67,68,68};
        byte[] bytes1 = {-11,-31-53,67,68,69};
        fos.write(bytes);
        fos.write(bytes1);
        fos.close();
    }
}
