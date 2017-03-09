package com.chuang;

/**
 * Created by Lc on 2017/3/7.
 */
import java.util.Enumeration;

public class VectorAndEnum {
    //颜色枚举
    enum Color
    {
        Red,Green,Blue,Yellow
    }
    public static void main(String args[]) {

        Enumeration days;
        java.util.Vector dayNames = new java.util.Vector();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
        System.out.println(Color.Red);
    }
}
