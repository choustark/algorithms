package com.chou.datastructure.stack;

import com.chou.datastructure.array.Array;

/**
 * @author Axel
 * @version 1.0
 * @className ArrayStack
 * @description 数组实现栈
 * @date 2021/11/18 22:53
 */

public class ArrayStack<E> implements Stack<E> {
    private Array<E> array;
    public ArrayStack(){
        this(10);
    }
    public ArrayStack(int capacity){
        array = new Array<>(capacity);
    }

    /**
     * 入栈
     */
    @Override
    public void push(E element) {
        array.addLast(element);
    }

    /**
     * @return
     */
    @Override
    public E pop() {
        return array.removeLast();
    }

    /**
     * @return
     */
    @Override
    public E peek() {
        return array.getFirst();
    }

    /**
     * 栈中是否有元素
     * @return
     */
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    /**
     * 获取栈的长度
     * @return
     */
    @Override
    public int getLength() {
        return array.getSize();
    }
}
