package com.chuang.io;

import java.io.*;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

/**
 * 修改文件最后修改时间
 * 获取文件大小(第三方jar引入FileUtils)
 * Created by Lc on 2017/3/9.
 */
public class UpdateDate {
    public static void main(String[] args) throws Exception {
        File fileToChange = new File("C:\\Users\\Chuang\\Desktop\\test.txt");
        fileToChange.createNewFile();
        Date filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
        System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));
        filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
    }

    /**
     * 获取文件夹大小
     */
    @Test
    public void GetSize(){
        long size = FileUtils.sizeOfDirectory(new File("C:\\Users\\Chuang\\Desktop\\mybatis"));
        System.out.println("Size: " + size + " bytes");
    }
}
