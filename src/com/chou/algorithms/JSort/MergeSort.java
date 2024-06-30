package com.chou.algorithms.JSort;

import java.util.Arrays;

/**
 * @Author Chou
 * @Description 归并排序
 * @ClassName MergeSort
 * @Date 2024/1/23 21:50
 * @Version 1.0
 **/
public class MergeSort {

    private MergeSort() {
    }

    /**
     * 排序算法
     *
     * @param arr
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort(E[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    /**
     * 归并排序
     * @param arr
     * @param l
     * @param r
     * @param <E>
     */
    private static <E extends Comparable<E>> void sort(E[] arr, int l, int r) {
        if (l >= r) return;
        int mid = l + (r - l) / 2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }


    /**
     * 合并两个有序区间 arr[l,mid] 和 arr[mid + 1,r]
     *
     * @param arr 数组
     * @param l   最左边的元素索引
     * @param mid 中间的元素索引
     * @param r   最中间的元素索引
     * @param <E> 被合并的对象需要实现可以排序接口
     */
    private static <E extends Comparable<E>> void merge(E[] arr, int l, int mid, int r) {
        // 用于临时存储排序后的数据
        E[] temp = Arrays.copyOfRange(arr, l, r + 1);

        int i = l, j = mid + 1;

        // 每轮循环为 arr[k] 赋值
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                //temp 数组与arr数组有l的偏移
                arr[k] = temp[j - l];
                j++;
            } else if (j > r) {
                arr[k] = temp[i - l];
                j++;
            } else if (temp[i - l].compareTo(temp[j - l]) <= 0) {
                arr[k] = temp[i - l];
                j++;
            } else {
                arr[k] = temp[j - l];
                j++;
            }
        }
    }
}
