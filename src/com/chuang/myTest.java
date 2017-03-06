package com.chuang;

import java.util.Scanner;

/**
 * Created by Lc on 2017/3/6.
 */
public class myTest {

    public static void  main(String[] args) {
        boolean falg = true;
        while(falg){
            System.out.println("请输入：");
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            if ("张三".equals(s)) {
                System.err.print("OK");
                break;
            } else {
                System.out.println("输入不匹配！");
            }
        }
    }
}
