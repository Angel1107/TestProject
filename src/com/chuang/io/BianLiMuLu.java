package com.chuang.io;

import java.io.*;

/**
 * 遍历指定目录下的所有目录
 * Created by Lc on 2017/3/9.
 */
public class BianLiMuLu {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Chuang\\Desktop");
        File[] files = dir.listFiles();
        FileFilter fileFilter = new FileFilter() {
            public boolean accept(File file) {
                return file.isDirectory();
            }
        };
        files = dir.listFiles(fileFilter);
        System.out.println(files.length);
        if (files.length == 0) {
            System.out.println("目录不存在或它不是一个目录");
        }
        else {
            for (int i=0; i< files.length; i++) {
                File filename = files[i];
                System.out.println(filename.toString());
            }
        }
    }

}
