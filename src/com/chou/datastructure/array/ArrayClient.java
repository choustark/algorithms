package com.chou.datastructure.array;


/**
 * @author Axel
 * @version 1.0
 * @className ArrayClient
 * @description 数组客户端测试
 * @date 2021/11/14 0:11
 */

public class ArrayClient {
    public static void main(String[] args) {
        Array<Integer> array = new Array<>();
        /*array.addLast(1);*/
        array.add(0,2);
        array.add(1,3);
        array.add(2,4);
        array.add(3,5);
        array.add(4,5);
        array.add(5,5);
        array.add(6,5);
        array.add(7,5);
        array.add(8,5);
        array.add(9,5);
        array.add(10,6);
        array.add(11,6);

        /*System.out.println(array.toString());
        Integer removeInteger = array.removeFirst();
        System.out.println(removeInteger);
        System.out.println(array);
        Integer remove = array.remove(0);
        System.out.println(remove);*/
        System.out.println(array);
    }

}
