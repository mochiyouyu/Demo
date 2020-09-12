package com.zzu.demo;

import java.io.*;

public class InputStreamDemo {
    public static void main(String[] args) {

        //存在乱码问题
//        try {
//            byte[] bWrite={11,3,21,40,15};
//            OutputStream os=new FileOutputStream(("hello.txt"));
//            for (int x=0;x<bWrite.length;x++){
//                os.write(bWrite[x]);
//            }
//            os.close();
//
//            InputStream input=new FileInputStream("hello.txt");
//            int size=input.available();
//            for (int i = 0; i <size ; i++) {
//                System.out.println((char)input.read()+" ");
//            }
//
//            input.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //解决了乱码问题
//    try {
//        File file = new File("hello.txt");
//        FileOutputStream fos = new FileOutputStream(file);
//        OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
//        osw.append("中文输入");
//        osw.append("\r\n");
//        osw.append("English");
//        osw.close();
//        fos.close();
//        FileInputStream fis=new FileInputStream(file);
//        InputStreamReader isr=new InputStreamReader(fis,"utf-8");
//        StringBuffer sb=new StringBuffer();
//        while(isr.ready()){
//            sb.append((char)isr.read());
//        }
//        System.out.println(sb.toString());
//        isr.close();
//        fis.close();
//    }catch(IOException e){
//        e.printStackTrace();
//    }
    try {
        File file = new File("hello.txt");
        FileOutputStream fos= new FileOutputStream(file);
        OutputStreamWriter writer = new OutputStreamWriter(fos,"utf-8");
        byte[] bWriter={1,2,3,4,5};
        writer.write(String.valueOf(bWriter));
//        writer.append("你好");
//        writer.append("\n");
//        writer.append("再见");
        writer.close();
    }catch(IOException e){
        e.printStackTrace();
    }

    }
}
