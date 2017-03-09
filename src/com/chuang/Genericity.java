package com.chuang;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Lc on 2017/3/8.
 */
public class Genericity {

    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("Chuang");
        age.add(18);
        number.add(314);

        getData(name);
        getData(age);
        getData(number);

        //getUperNumber(name);//1
        getUperNumber(age);//2
        getUperNumber(number);//3
    }

    /**
     * 泛型通配符
     * @param data
     */
    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }

    /**
     * 泛型继承
     * @param data
     */
    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("data :" + data.get(0));
    }
}
