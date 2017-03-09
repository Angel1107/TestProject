package com.chuang.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Lc on 2017/3/8.
 */
public class TestCurr {
    public static void main(String[] args){
        Long timeStamp = System.currentTimeMillis();  //获取当前时间戳
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));   // 时间戳转换成时间
        System.out.println(sd);
    }
}
