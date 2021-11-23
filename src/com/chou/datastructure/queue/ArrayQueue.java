package com.chou.datastructure.queue;


import com.chou.datastructure.array.Array;

/**
 * @ClassName ArrayQueue
 * @Description 队列 先进先出的一种数据结构  数组实现队列
 * @Author Axel
 * @Date 2021/4/26 0:02
 * @Version 1.0
 */

public class ArrayQueue<E> implements Queue<E> {

    // 基于数据实现队列
    private Array<E> data;

    public ArrayQueue() {
        this(10);
    }

    public ArrayQueue(int capacity) {
        data = new Array<>(capacity);
    }


    @Override
    public void enqueue(E element) {
        data.addLast(element);
    }

    @Override
    public E dequeue() {
        return data.removeFirst();
    }

    @Override
    public E getFront() {
        return data.getFirst();
    }

    @Override
    public int getSize() {
        return data.getSize();
    }

    public int getCapacity() {
        return data.getCapacity();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }
}

