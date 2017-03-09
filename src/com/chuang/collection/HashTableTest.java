package com.chuang.collection;

import java.util.Enumeration;
import java.util.*;


/**
 * HashTable遍历
 * Created by Lc on 2017/3/9.
 */
public class HashTableTest {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");
        /*Set set = ht.entrySet();
        System.out.println(set);*/

      /* 不建议用，，，还需要配合map.entry
        for (Hashtable.Entry<String, Object> entry :ht.entrySet()){
           System.out.println("key= " + entry.g + " and value= " + entry.getValue());
        }
        */
        Enumeration e = ht.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }

}

