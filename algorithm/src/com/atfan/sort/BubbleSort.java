package com.atfan.sort;

import java.util.Arrays;

/**
 * @author fx
 * @create 2021-01-23 10:31
 */
public class BubbleSort {
    int age;

    public static void main(String[] args) {
        Integer[] a = {4, 5, 6, 3, 2, 1};
        BubbleSort.sort(a);
        System.out.println(Arrays.toString(a));
    }

    /*对数组a内的元素进行排序*/
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (greater(a[j], a[j + 1])) {
                    exch(a, j, j + 1);
                }
            }
        }
    }

    /*比较v元素是否大于w元素*/
    public static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    /*交换数组元素i和j的位置*/
    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
