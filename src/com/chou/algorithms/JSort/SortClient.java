package com.chou.algorithms.JSort;

import com.chou.algorithms.JSort.utils.SortHelper;

/**
 * @ClassName SortClient
 * @Description 排序客户端测试
 * @Author Axel
 * @Date 2021/10/22 23:14
 * @Version 1.0
 */

public class SortClient {
    public static void main(String[] args) {
        //SortHelper.consumeTime("SelectionSort", 100);
        int[] loopNums = new int[]{10000, 100000};
        for (int i = 0; i < loopNums.length; i++) {
            SortHelper.consumeTime("SelectionSort", loopNums[i]);
            SortHelper.consumeTime("InsertionSort", loopNums[i]);
        }
    }
}
