package com.chuang.io;

import java.io.*;

/**
 * 创建文件并写入数据
 * Created by Lc on 2017/3/9.
 */
public class BufferedWriterTest {
    public static void main(String[] args)  {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Chuang\\Desktop\\test.txt"));
            out.write("BufferedWriter Test  By Chuang");
            out.close();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
        }
    }
}
