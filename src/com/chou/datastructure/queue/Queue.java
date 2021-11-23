package com.chou.datastructure.queue;

/**
 * @author Axel
 * @version 1.0
 * @className Queue
 * @description 队列基类
 * @date 2021/11/20 22:45
 */
public interface Queue<E> {
    public void enqueue(E element);
    public E dequeue();
    public E getFront();
    public int getSize();
    public boolean isEmpty();
}
