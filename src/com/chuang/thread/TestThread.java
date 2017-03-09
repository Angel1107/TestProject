package com.chuang.thread;

/**
* Created by Lc on 2017/3/8.
*/
public class TestThread {

public static void main(String args[]) {
    /**
     * 实现runable
     */
   /* RunnableDemo R1 = new RunnableDemo( "线程1");
    R1.start();

    RunnableDemo R2 = new RunnableDemo( "线程2");
    R2.start();*/
    /**
     * 继承Thread
     */
    ThreadDemo T1 = new ThreadDemo( "线程one");
    T1.start();

    ThreadDemo T2 = new ThreadDemo( "线程two");
    T2.start();


}
}
