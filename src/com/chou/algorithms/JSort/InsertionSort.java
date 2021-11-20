package com.chou.algorithms.JSort;

import edu.princeton.cs.algs4.In;

/**
 * @className InsertSort
 * @description 插入排序
 * @author Axel
 * @date 2021/10/24 23:26
 * @version 1.0
 *
 *
 */

public class InsertionSort extends AbsSort{

    public InsertionSort(){};

    /**
     * 使用交换的方式排序
     * @param arr
     * @param <E>
     */
    public static <E extends Comparable<E>> void sortBySwap(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j - 1 >= 0; j--) {
                if (arr[j].compareTo(arr[j-1]) < 0) {
                    swap(arr, j - 1, j);
                } else {
                    break;
                }
            }
        }
    }

    /**
     * 使用平移的方式排序
     * @param arr
     * @param <E>
     */
    public static <E extends Comparable<E>> void sortByTranslation(E[] arr ){
        for (int i = 0; i < arr.length; i++) {
            E t = arr[i];
            int j;
            for ( j = i; j - 1 >= 0 ; j--) {
                if(t.compareTo(arr[j - 1]) < 0){
                    arr[j] = arr[j - 1];
                }else {
                    break;
                }
            }
            arr[j] = t;
        }
    }
}
