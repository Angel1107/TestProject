package com.chuang.io;

import java.io.*;

/**
 * 文件复制
 * Created by Lc on 2017/3/9.
 */
public class FileCopy {
    public static void main(String[] args) throws Exception {
        //FileWriter指定文件写出路劲
        BufferedWriter out1 = new BufferedWriter(new FileWriter("srcfile"));
        out1.write("string to be copied\n");
        out1.close();
        //File指定文件  先用FileInputStream读出来，然后用OutputStream写进去
        InputStream in = new FileInputStream(new File("srcfile"));
        OutputStream out = new FileOutputStream
                (new File("destnfile"));
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
        //FileReader指定读取的文件
        BufferedReader in1 = new BufferedReader(new FileReader("destnfile"));
        String str;
        while ((str = in1.readLine()) != null) {
            System.out.println(str);
        }
        in1.close();
    }
}
