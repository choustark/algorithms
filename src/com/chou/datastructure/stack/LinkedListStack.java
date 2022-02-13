package com.chou.datastructure.stack;

import com.chou.datastructure.linklist.DummyHeadLinkList;
import com.chou.datastructure.linklist.LinkList;

/**
 * @author Axel
 * @version 1.0
 * @className LinkedListStack
 * @description 基于LinkedList 实现链表栈
 * @date 2022/2/13 22:41
 */

public class LinkedListStack<E> implements Stack<E>{

    private DummyHeadLinkList<E> list;

    @Override
    public void push(E element) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getLength() {
        return 0;
    }
}
