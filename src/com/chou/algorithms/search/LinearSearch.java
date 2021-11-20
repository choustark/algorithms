package com.chou.algorithms.search;

/**
 * @ClassName LinearSearch
 * @Description 线性查找
 * @Author Axel
 * @Date 2021/9/12 20:45
 * @Version 1.0
 */

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = GenerateArray.generateArrayData(100000000);
        long startTime = System.nanoTime();
        int i = searchLinear(array, 11);
        long endTime = System.nanoTime();
        long time = (endTime - startTime) / 1000000000;
        System.out.println(time);
    }

    public static int searchLinear(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
