package com.chuang.io;

import java.io.*;

/**
 * 往原有文件里面追加数据
 * Created by Lc on 2017/3/9.
 */
public class FileAppend {
    public static void main(String[] args) throws Exception {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("filename.doc"));
            out.write("aString1\n");
            out.close();
            out = new BufferedWriter(new FileWriter("filename.doc",true));
            out.write("aString2");
            out.close();
            BufferedReader in = new BufferedReader(new FileReader("filename.doc"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close();
        }
        catch (IOException e) {
            System.out.println("exception occoured"+ e);
        }
    }
}
