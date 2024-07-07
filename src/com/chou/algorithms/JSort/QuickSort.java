package com.chou.algorithms.JSort;

/**
 * 快速排序
 * @author by Axel
 * @since 2024/7/7 下午5:59
 */
public class QuickSort extends AbsSort{

    private QuickSort(){}

    /**
     * 排序算法
     * @param arr
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort(E[] arr){
        sort(arr, 0, arr.length - 1);
    }

    /**
     * 递归快速排序
     * @param arr
     * @param l
     * @param r
     * @param <E>
     */
    private static <E extends Comparable<E>> void sort(E[] arr, int l, int r){
        if(l >= r){return;}
        int partition = partition(arr, l, r);
        sort(arr, l, partition - 1);
        sort(arr, partition + 1, r);
    }

    /**
     * 分区
     * @param arr
     * @param l
     * @param r
     * @param <E>
     */
    private static <E extends Comparable<E>> int  partition(E[] arr, int l, int r){
        // arr[l+i...j] < v ; arr[j+1...i] >= v
        int j = l;
        for (int i = l + 1;i <=r ; i++) {
            if (arr[i].compareTo(arr[l]) < 0){
                j++;
                swap(arr, i, j);
            }
        }
        swap(arr, l, j);
        return j;
    }
}
