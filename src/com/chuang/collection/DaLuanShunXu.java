package com.chuang.collection;

import org.junit.Test;

import java.util.*;

/**
 * 打乱顺序 Collections.shuffle（lst）
 * 集合反转Collections.reverse(lst);
 * 只读集合Collections.unmodifiableXXXX(xxxx为List 或 Set 或 Map)
 * 循环移动元素
 * Created by Lc on 2017/3/9.
 */
public class DaLuanShunXu {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            list.add(new Integer(i));
        System.out.println("打乱前:");
        System.out.println(list);

        for (int i = 1; i < 6; i++) {
            System.out.println("第" + i + "次打乱：");
            Collections.shuffle(list);
            System.out.println(list);
        }
    }

    /**
     * 测试循环移动
     * Test rotote.
     */
    @Test
    public void TestRotote(){
        List list = Arrays.asList("one Two three Four five six".split(" "));
        System.out.println("List :"+list);
        Collections.rotate(list, 2);
        System.out.println("rotate: " + list);
    }

}
