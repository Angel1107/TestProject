package com.chuang.io;

import org.junit.Test;

import java.io.*;

/**
 * 1.指定目录中查找文件
 * 2.查看系统根目录
 * 3.查看当前目录
 * 4.遍历目录
 * Created by Lc on 2017/3/9.
 */
public class MuLuFindFile {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Chuang\\Desktop");
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept
                    (File dir, String name) {
                return name.startsWith("o");
            }
        };
        String[] children = dir.list(filter);
        if (children == null) {
            System.out.println("目录不存在或它不是一个目录");
        }
        else {
            for (int i=0; i < children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }

    /**
     * 获取磁盘根目录
     */
    @Test
    public void GetRoots(){
        File[] roots = File.listRoots();
        System.out.println("系统所有根目录：");
        for (int i=0; i < roots.length; i++) {
            System.out.println(roots[i].toString());
        }
         //查看当前目录
        String curDir = System.getProperty("user.dir");
        System.out.println("你当前的工作目录为 :" + curDir);
    }
    //遍历目录
    public void visitAllDirsAndFiles(File dir) {
        System.out.println(dir);
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                visitAllDirsAndFiles(new File(dir, children[i]));
            }
        }
    }
    //测试遍历目录
    @Test
    public void TestBianLiMuLu(){
        System.out.println("遍历目录");
        File dir = new File("out\\production\\TestProject"); //要遍历的目录
        visitAllDirsAndFiles(dir);
    }
}
