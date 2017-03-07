package com.chuang;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Lc on 2017/3/7.
 */
public class Map {
    /**
     * map的遍历
     * @param args
     */
    public static void main(String args[]){
        java.util.Map<Integer,Object> map = new HashMap<Integer,Object>();
        map.put(1,12);
        map.put(3,15);
        map.put(5,18);
        map.put(2,13);
        map.put(4,16);
        map.put(9,"张三");
        Set<Integer> set = map.keySet();
        /**
         * foreach增强型for循环
         */
        for (Integer key:set) {
            System.out.println(key+":"+map.get(key));
        }
        /**
         * Iterator迭代器遍历
         */
        Iterator it = set.iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            Object value = map.get(key);
            System.out.println(key+" : "+value);
        }
    }
}
