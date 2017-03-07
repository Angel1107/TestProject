package com.chuang;

import static java.lang.Math.*;

/**
 * Created by Lc on 2017/3/7.
 */
public class Math {
    public static void main (String args[]){
        /**
         * Number方法
         */
        Number a = 123.4;
        a.doubleValue();//xxxalue方法，将 Number 对象转换为xxx数据类型的值并返回。
        boolean ab =  a.equals(123); //判断number对象是否与参数相等。
        System.out.println(ab);

        /**
         * Math 方法
         */
        System.out.println(random());   //返回一个随机数
        System.out.println(abs(-1));    //返回参数的绝对值。            1
        System.out.println(ceil(1.2));  //向上取整。返回类型为double。  2.0
        System.out.println(floor(1.8)); //向下取整。返回类型为double。  1.0
        System.out.println(rint(1.5));  //返回与参数最接近的整数。返回类型为double。 2.0
        System.out.println(round(1.5)); //返回一个最接近的int、long型值。            2
        System.out.println(min(1.2,1.8));//返回两个参数中的最小值        1.2
        System.out.println(max(1.2,1.8));//返回两个参数中的最大值        1.8
        System.out.println(exp(3));      //返回自然数底数e的参数次方     20.085536923187668
        System.out.println(log(3));      //返回参数的自然数底数的对数值。1.0986122886681098
        System.out.println(pow(2,3));    //返回第一个参数的第二个参数次方。   8.0
        System.out.println(sqrt(3));     //求参数的算术平方根。          1.7320508075688772
        System.out.println(sin(3));      //求指定double类型参数的正弦值。
        System.out.println(cos(3));      //求指定double类型参数的余弦值。
        System.out.println(tan(3));      //求指定double类型参数的正切值。
        System.out.println(asin(3));     //求指定double类型参数的反正弦值。返回非数字  NaN
        System.out.println(acos(3));     //求指定double类型参数的反余弦值。返回非数字  NaN
        System.out.println(atan(3));     //求指定double类型参数的反正切值。
        System.out.println(atan2(2,3));  //将笛卡尔坐标转换为极坐标，并返回极坐标的角度值。
        System.out.println(toDegrees(2));//将参数转化为角度。
        System.out.println(toRadians(2));//将角度转换为弧度。
    }
}
