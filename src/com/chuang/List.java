package com.chuang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Lc on 2017/3/7.
 */
public class List {
    /**
     * 改写版main方法
     * @param s
     */
    public static void main(String[] s){
        LinkedList();

       // ArrayList();
    }


    /**
     * LinkedList
     */
    public static void LinkedList(){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addLast("z...");//添加最后一个
        list.add(2,"Chuang");//指定下标添加数据到集合
        list.addFirst("a...");
        list.removeFirst();//移除最后一个

        Iterator it =  list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for (Object o:list) {
            System.out.println(o);
        }

    }

    /**
     * ArrayList
     */
    public static void ArrayList(){
        ArrayList list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add(123);
        list.clear();//清空集合
        list.add("王五");
           Object o = list.clone();//集合克隆
        for (Object lst:list) {
            System.err.println(lst);
            System.err.println(list.size());
        }

        Iterator it = list.iterator();
        while(it.hasNext()){
            System.err.println(it.next());
            System.err.println(it.hashCode());
        }
    }




}
