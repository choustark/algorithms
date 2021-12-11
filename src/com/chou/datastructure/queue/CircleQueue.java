package com.chou.datastructure.queue;


/**
 * @ClassName CircleQueue
 * @Description 数组环形队列实现
 * @Author Axel
 * @Date 2021/5/2 17:01
 * @Version 1.0
 */

public class CircleQueue<E> implements Queue<E> {
    private E[] data;
    private int size;
    private int front;
    private int tail;

    public CircleQueue() {
    }

    public CircleQueue(int capacity) {
        data = (E[]) new Object[capacity + 1];
        size = 0;
        front = 0;
        tail = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    /**
     * 判断队列是否满了
     *
     * @return
     */
    public boolean isFull() {
        return (tail + 1) % data.length == front;
    }

    /**
     * 返回的是数组的长度 arr.length
     *
     * @return
     */
    private int getCapacity() {
        return data.length - 1;
    }

    /**
     * 入队
     *
     * @param element
     */
    @Override
    public void enqueue(E element) {
        if (isFull()) {
            resize(getCapacity() * 2);
        }
        data[tail] = element;
        tail = (tail + 1) % data.length;
        size++;
    }

    /**
     * 出队
     *
     * @return
     */
    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Dequeue() failed,this CircleQueue is empty queue");
        }
        E oldValue = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        if (size == getCapacity() / 4 && getCapacity() / 2 != 0) {
            resize(getCapacity() / 2);
        }
        return oldValue;
    }

    /**
     * 获取队首元素
     *
     * @return
     */
    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Dequeue() failed,this CircleQueue is empty queue");
        }
        return data[front];
    }

    /**
     * 扩容接口
     *
     * @param newCapacity
     */
    private void resize(int newCapacity) {
        E[] newArr = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            data[i] = data[(i + front) % data.length];
        }
        data = newArr;
        front = 0;
        tail = size;

    }

    @Override
    public String toString() {
        StringBuffer sBuff = new StringBuffer();
        sBuff.append(String.format("Circle Queue = %d capacity= %d\n", size, getCapacity()));
        sBuff.append("front [");
        for (int i = front; i != tail; i = (i + 1) / data.length) {
            sBuff.append(data[i]);
            if ((1 + i) % data.length != tail) {
                sBuff.append(",");
            }
        }
        sBuff.append("] tail");
        return sBuff.toString();
    }
}
