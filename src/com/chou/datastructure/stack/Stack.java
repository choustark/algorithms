package com.chou.datastructure.stack;

/**
 * @author Axel
 * @version 1.0
 * @className Stack
 * @description 栈的抽象
 * @date 2021/11/18 22:51
 */

public interface Stack<E> {
    public void push(E element);
    public E pop();
    public E peek();
    public boolean isEmpty();
    public int getLength();

}
