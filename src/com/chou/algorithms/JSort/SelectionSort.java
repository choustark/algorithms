package com.chou.algorithms.JSort;

import static com.chou.algorithms.JSort.AbsSort.swap;

/**
 * @ClassName SelectionSort
 * @Description 选择排序算法类
 * @Author Axel
 * @Date 2021/10/17 22:35
 * @Version 1.0
 */

public class  SelectionSort {

    public SelectionSort() {
    }

    /**
     * 使用泛型解决类型转换问题
     * @param arr
     * @param <E>
     */
    public static <E extends Comparable<E>> void selectSort(E[] arr) {

        // 选择 arr[i...n) 中最小值的索引 arr[1..i),和arr[i...n) 维持着一个循环不变量
        for (int i = 0; i < arr.length; i++) {
            // 循环数据,获取数据中第i个元素与其他元素对比
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }

    }
}
