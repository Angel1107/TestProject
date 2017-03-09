package com.chuang.shuzu;

/**
 * Created by Lc on 2017/3/8.
 */
public class Main {
    /**
     * 数组扩充，创建一个新数组
     * System.arraycopy（原数组名，开始下标，新数组名，开始下标，指定长度）
     * 集合差集  多的removeAll()少的
     * 集合交集  retainAll()
     * 判断集合是否相等  Arrays.equals(数组1，数组2)
     * @param args
     */
    public static void main(String[] args) {
        String[] names = new String[] { "A", "B", "C" };
        String[] extended = new String[5];
        extended[3] = "D";
        extended[4] = "E";
        System.arraycopy(names, 1, extended, 0, names.length);
        for (String str : extended){
            System.out.println(str);
        }
    }
}