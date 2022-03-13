package com.chou.datastructure.queue;

import com.chou.datastructure.stack.ArrayStack;

/**
 * @author Axel
 * @version 1.0
 * @className StackQueue
 * @description TODO
 * @date 2021/12/5 23:58
 */

public class StackQueue<E> implements Queue<E> {
    public ArrayStack<E> leftStack;
    public ArrayStack<E>  rightStack;
    @Override
    public void enqueue(E element) {

    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E getFront() {
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
