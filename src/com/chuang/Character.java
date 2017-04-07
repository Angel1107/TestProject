package com.chuang;

/**
 * Created by Lc on 2017/3/7.
 */
public class Character {
    /**
     * Test Character 转义
     * @param args
     */
    public static void main (String args[]){
        System.out.print("test\tTab键\n");       //测试\t\n
        System.out.println("Test \b Test");      //测试后退键，无效果
        System.out.println("Test \r Test");      //测试插入回车，后面的没了
        System.out.println("Test \f Test");      //测试换页符,无效果
        System.out.println("Test \' Test  \'");  //测试单引号
        System.out.println("Test \" Test  \"");  //测试双引号
        System.out.println("Test \\ Test  \\");  //测试反斜杠
    }

}
