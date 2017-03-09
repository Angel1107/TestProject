package com.chuang.java;

/**
 * 算术阶乘
 * Created by Lc on 2017/3/9.
 */
public class JieCheng {
    public static void main(String args[]) {
        for (int counter = 0; counter <= 10; counter++){
            System.out.printf("%d! = %d\n", counter,
                    factorial(counter));
        }
    }
    public static long factorial(long number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number - 1);
    }

}
