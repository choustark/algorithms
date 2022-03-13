package com.chou.datastructure.queue;

import com.chou.datastructure.linklist.LinkedList;
import com.chou.datastructure.stack.ArrayStack;

/**
 * @author Axel
 * @version 1.0
 * @className LinkListQueue
 * @description 链表实现队列
 * @date 2022/2/26 10:59
 */

public class LinkedListQueue<E> implements Queue<E>{

    /**
     * 节点类
     * 用于存储参数、下个节点信息
     */
    private class Node {
        E e;
        Node next;

        public Node(E e, Node node) {
            this.e = e;
            this.next = node;
        }

        public Node(E e) {
            this.e = e;
            this.next = null;
        }

        public Node() {
            this.e = null;
            this.next = null;
        }

        @Override
        public String toString() {
            return e.toString();
        }

    }

    // 定义头节点和未节点
    public Node tail,front;
    // 队列长度
    public int size;

    @Override
    public void enqueue(E element) {

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
