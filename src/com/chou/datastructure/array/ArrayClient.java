package com.chou.datastructure.array;


/**
 * @author Axel
 * @version 1.0
 * @className ArrayClient
 * @description 数组验证
 * @date 2021/11/14 0:11
 */

public class ArrayClient {
    public static void main(String[] args) {
        Array<Integer> array = new Array<>();
        array.addLast(1);
        array.add(1,2);
        array.add(2,3);
        array.add(3,4);
        array.add(4,5);
        System.out.println(array.toString());
        Integer removeInteger = array.removeFirst();
        System.out.println(removeInteger);
        System.out.println(array);
        Integer remove = array.remove(0);
        System.out.println(remove);
        System.out.println(array);
    }

}
