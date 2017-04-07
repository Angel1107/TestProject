package com.chuang.suanfa;

/**
 * 冒泡排序法（BubbleSort）
 * Created by Chuang on 2017/4/7.
 */
public class maopaoSort {
        public void sort(int[] a)
        {
            int temp = 0;
            for (int i = a.length - 1; i > 0; --i)
            {
                for (int j = 0; j < i; ++j)
                {
                    if (a[j + 1] < a[j])
                    {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        }
    }
