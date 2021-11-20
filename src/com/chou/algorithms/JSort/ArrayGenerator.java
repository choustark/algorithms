package com.chou.algorithms.JSort;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName ArrayGenerater
 * @Description 数组生成器
 * @Author Axel
 * @Date 2021/10/19 23:43
 * @Version 1.0
 */

public class ArrayGenerator {

    public ArrayGenerator(){};


    /**
     * 生成无序数组
     * @param n
     * @param bound
     * @return
     */
    public static Integer[] generatorArrRandom(int n,int bound)  {
        Integer[] arr = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(bound) + 1;
        }
        return arr;
    }


    /**
     * 生成有序数组
     * @param n
     * @return
     */
    public static int[] generatorOrderArr(int n){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}
