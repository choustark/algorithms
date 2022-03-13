package com.chou.datastructure.queue;

/**
 * @author Axel
 * @version 1.0
 * @className Queue
 * @description 队列基类
 * @date 2021/11/20 22:45
 */
public interface Queue<E> {
    /**
     * 入队
     * @param element
     */
    public void enqueue(E element);

    /**
     * 出队
     * @return
     */
    public E dequeue();

    /**
     * 获取队列的第一个元素
     * @return
     */
    public E getFront();

    /**
     * 队列的长度
     * @return
     */
    public int getSize();

    /**
     * 队列是否为null
     * @return
     */
    public boolean isEmpty();
}
