package com.chou.algorithms.search;

/**
 * @ClassName GenerateArray
 * @Description 生成数组及元素
 * @Author Axel
 * @Date 2021/9/12 21:09
 * @Version 1.0
 */

public class GenerateArray {

    public static int[] generateArrayData(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }
}
