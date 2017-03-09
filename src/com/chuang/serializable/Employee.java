package com.chuang.serializable;

/**
 * Created by Lc on 2017/3/8.
 */
public class Employee implements java.io.Serializable
{
    public String name;
    public String address;
    public transient int SSN;  //实现该接口，不被序列化
    public int number;

    /**
     * Test方法
     */
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}