package com.chuang.stack;

import java.util.Collections;
import java.util.Vector;

/**
 * 1.旋转向量+获取向量最大值
 * Created by Lc on 2017/3/9.
 */
public class VectorXuanZhuan {
    public static void main(String[] args) {
        Vector<String> v = new Vector();
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");
        v.add("5");
        System.out.println(v);
        //反转（）
        Collections.swap(v, 0, 4);
        //获取最大值
        Object obj = Collections.max(v);
        System.out.println("旋转后，最大值wei:"+obj);
        System.out.println(v);
    }
}
