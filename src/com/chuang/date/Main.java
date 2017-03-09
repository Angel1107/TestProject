package com.chuang.date;

/**
 * Created by Lc on 2017/3/8.
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main{
    /**
     * SimpleDateFormat时间转换
     * @param args
     */
    public static void main(String[] args){
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss a";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));
    }
}
