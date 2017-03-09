package com.chuang.io;

import java.io.*;

/**
 *  打印目录结构
 * Created by Lc on 2017/3/9.
 */
public class FileUtil {
    public static void main(String[] a)throws IOException{
        showDir(1, new File("C:\\Users\\Chuang\\Desktop\\mybatis"));
    }
    static void showDir(int indent, File file) throws IOException {
        for (int i = 0; i < indent; i++)
            System.out.print('-');
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++)
                showDir(indent + 4, files[i]);
        }
    }
}
