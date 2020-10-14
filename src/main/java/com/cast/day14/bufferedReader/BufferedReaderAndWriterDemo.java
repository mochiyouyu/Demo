package com.cast.day14.bufferedReader;

import java.io.*;
import java.util.HashMap;

public class BufferedReaderAndWriterDemo {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\com\\cast\\day14\\bufferedReader\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\main\\java\\com\\cast\\day14\\bufferedReader\\b.txt"));
        String line = null;
        while ((line = br.readLine()) !=null){
            String[] split = line.split("\\.");
            map.put(split[0],split[1]);
        }
        for (String s : map.keySet()) {
            bw.write(s+":"+map.get(s));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
