package com.chuang.shuzu;

import java.util.Arrays;

/**
 * Created by Lc on 2017/3/8.
 */
public class FillTest {
    /**
     * fill填充（数组名，参数）
     * fill(数组名，开始下标，结束下标，参数)
     * @param args
     */
    public static void main(String args[]) {
        int array[] = new int[6];
        Arrays.fill(array, 100);
        for (int i=0, n=array.length; i < n; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        Arrays.fill(array, 4, 6, 50);
        for (int i=0, n=array.length; i< n; i++) {
            System.out.println(array[i]);
        }
    }
}
