package com.cast.day12File.fileDemo;

import java.io.File;

public class Separator {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;//路径分隔符 window的是;,linux的是:
        System.out.println(pathSeparator);
        String separator = File.separator;
        System.out.println(separator);//文件名称分隔符 window的是\(反斜杠),linux的是/(正斜杠)
    }
}
