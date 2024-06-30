package com.chou.algorithms.JSort;

/**
 * @author Axel
 * @version 1.0
 * @className AbsSort
 * @description 排序基类
 * @date 2021/11/13 10:14
 */

public abstract class AbsSort {

    /**
     * 交换数组值的位置
     * @param arr 数组
     * @param originIndex  需要被交换位置的索引值
     * @param expectIndex
     * @param <E> 数组数据类型
     */
    public  static<E extends Comparable<E>>  void  swap(E[] arr,int originIndex,int expectIndex){
        E temp = arr[originIndex];
        arr[originIndex] = arr[expectIndex];
        arr[expectIndex] = temp;
    }
}
