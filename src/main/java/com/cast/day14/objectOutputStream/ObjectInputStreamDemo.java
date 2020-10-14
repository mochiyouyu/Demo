package com.cast.day14.objectOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\main\\java\\com\\cast\\day14\\objectOutputStream\\a.txt"));
        Object o = ois.readObject();
        System.out.println(o);
        Person person = (Person) o;
        System.out.println(person.getName()+":"+((Person) o).getAge());
    }
}
