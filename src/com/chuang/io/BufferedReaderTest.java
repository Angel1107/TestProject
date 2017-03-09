package com.chuang.io;

import java.io.*;

/**
 * BufferedReader 读取文件内容
 * Created by Lc on 2017/3/9.
 */
public class BufferedReaderTest
{
    public static void main(String[] args)  {
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Chuang\\Desktop\\test.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println(str);
        } catch (IOException e) {
        }
    }
}
