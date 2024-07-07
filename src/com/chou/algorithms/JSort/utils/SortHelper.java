package com.chou.algorithms.JSort.utils;

import com.chou.algorithms.JSort.*;

/**
 * @ClassName SortHelper
 * @Description 排序辅助类
 * @Author Axel
 * @Date 2021/10/19 23:44
 * @Version 1.0
 */

public class SortHelper {
    public static final double unit = 1000000000.0d;

    //计算时间方法
    public static <E> void consumeTime(String sortName, int n) {
        Integer[] arr = ArrayGenerator.generatorArrRandom(n, n);
        long startTime = System.nanoTime();
        if ("SelectionSort".equals(sortName)) {
            SelectionSort.selectSort(arr);
        } else if ("InsertionSort".equals(sortName)) {
            InsertionSort.sortByTranslation(arr);
        } else if ("BubbleSort".equals(sortName)) {
            BubbleSort.sort(arr);
        } else if ("MergeSort".equals(sortName)) {
            MergeSort.sort(arr);
        } else if ("QuickSort".equals(sortName)) {
            QuickSort.sort(arr);
        } else {
            throw new IllegalArgumentException("Unsupported sort name: " + sortName);
        }
        long endTime = System.nanoTime();
        double costTime = (endTime - startTime) / unit;
        System.out.println(sortName + "排序" + n + "个元素耗时：" + costTime);
        if (SortHelper.checkSort(arr)) {
            System.out.println("arr sorted success!");
        } else {
            throw new RuntimeException("arr sorted is failed!");
        }
    }

    // 校验算法是够排序成功
    public static <E extends Comparable<E>> boolean checkSort(E[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].compareTo(arr[i]) > 0) {
                return false;
            }
        }
        return true;
    }
}
