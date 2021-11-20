package com.chou.algorithms.JSort;

/**
 * @author Axel
 * @version 1.0
 * @className BubbleSort
 * @description 冒泡排序
 * @date 2021/11/20 16:55
 */

public class BubbleSort<E> extends AbsSort {

    /**
     * 排序 相邻元素比较大小将大值的元素完后移
     * @param arr
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j+1].compareTo(arr[i])<0) {
                    swap(arr,j+i,i);
                }
            }
        }
    }

}
