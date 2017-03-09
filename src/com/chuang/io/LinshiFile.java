package com.chuang.io;

import java.io.*;

/**
 * 创建临时文件
 * Created by Lc on 2017/3/9.
 */
public class LinshiFile {
    public static void main(String[] args) throws Exception {
        File temp = File.createTempFile("pattern", ".suffix");
        temp.deleteOnExit();
        BufferedWriter out = new BufferedWriter(new FileWriter(temp));
        out.write("aString");
        System.out.println("临时文件已创建:");
        out.close();
    }
}
