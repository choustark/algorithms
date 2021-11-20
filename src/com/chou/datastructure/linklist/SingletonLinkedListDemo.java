package com.chou.datastructure.linklist;

/**
 * @ClassName SingletonLinkedListDemo
 * @Description TODO
 * @Author Axel
 * @Date 2021/5/23 22:53
 * @Version 1.0
 */

public class SingletonLinkedListDemo {
    public static void main(String[] args) {

        SingletonLinkedList linkedList = new SingletonLinkedList();
        // 添加值
        linkedList.add(new LinkNode(1,"1号"));
        linkedList.add(new LinkNode(2,"2号"));
        linkedList.add(new LinkNode(3,"3号"));
        linkedList.add(new LinkNode(4,"4号"));
        // 输出链表值
        linkedList.list();
    }
}




