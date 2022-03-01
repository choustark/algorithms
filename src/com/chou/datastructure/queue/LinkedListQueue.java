package com.chou.datastructure.queue;

import com.chou.datastructure.stack.ArrayStack;

/**
 * @author Axel
 * @version 1.0
 * @className LinkListQueue
 * @description 链表实现队列
 * @date 2022/2/26 10:59
 */

public class LinkedListQueue<E> implements Queue<E>{
    public ArrayStack<E>  leftStack;
    public ArrayStack<E>  rightStack;
    @Override
    public void enqueue(Object element) {

    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E  getFront() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
