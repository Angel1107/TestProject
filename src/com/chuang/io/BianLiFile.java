package com.chuang.io;

import java.io.File;

/**
 * 遍历目录下的所有文件
 * Created by Lc on 2017/3/9.
 */
public class BianLiFile {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Chuang\\Desktop");
        String[] children = dir.list();
        if (children == null) {
            System.out.println( "目录不存在或它不是一个目录");
        }
        else {
            for (int i=0; i< children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }
}
