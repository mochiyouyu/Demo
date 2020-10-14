package com.cast.day14.objectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\main\\java\\com\\cast\\day14\\objectOutputStream\\a.txt"));
        Person person = new Person("张三",20);
        oos.writeObject(person);//存储的文件是二进制类型的
        oos.close();
    }
}
