package com.cast.day12File.fileDemo;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory())
            return true;
        if(pathname.getName().endsWith(".chw")){
            return true;
        }else{
            return false;
        }
    }
}
