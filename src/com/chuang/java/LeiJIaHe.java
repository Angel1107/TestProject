package com.chuang.java;

/**
 * 斐波那契数列
 * 特别指出：第0项是0，第1项是第一个1。
 * 这个数列从第三项开始，每一项都等于前两项之和。
 * Created by Lc on 2017/3/9.
 */
public class LeiJIaHe {
    public static long fibonacci(long number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }
    public static void main(String[] args) {
        for (int counter = 0; counter <= 10; counter++){
            System.out.printf("Fibonacci of %d is: %d\n",
                    counter, fibonacci(counter));
        }
    }
}
