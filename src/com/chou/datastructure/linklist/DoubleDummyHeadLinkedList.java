
package com.chou.datastructure.linklist;

/**
 * @author Axel
 * @version 1.0
 * @className DoubleDummyHeadLinkedList
 * @description 双向列表 - 支持泛型 E
 * @date 2022/2/27 17:36
 */
public class DoubleDummyHeadLinkedList<E> {

    // 定义泛型节点类
    private class Node {
        E data;           // 改为泛型 E
        Node prev;
        Node next;

        public Node(E data) {
            this.data = data;
        }
    }

    // 虚拟头尾节点
    private final Node head;
    private final Node tail;
    private int size;

    // 初始化带有虚拟头尾节点的链表
    public DoubleDummyHeadLinkedList() {
        head = new Node(null); // 虚拟头节点
        tail = new Node(null); // 虚拟尾节点
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    // 在链表末尾添加元素
    public void add(E data) {
        Node newNode = new Node(data);
        Node lastNode = tail.prev;

        lastNode.next = newNode;
        newNode.prev = lastNode;
        newNode.next = tail;
        tail.prev = newNode;

        size++;
    }

    // 删除第一个匹配的节点
    public void delete(E key) {
        Node current = head.next;

        while (current != tail) {
            if (current.data.equals(key)) {
                Node prevNode = current.prev;
                Node nextNode = current.next;

                prevNode.next = nextNode;
                nextNode.prev = prevNode;

                size--;
                return;
            }
            current = current.next;
        }

        throw new IllegalStateException("Delete failed! No matching node found.");
    }

    // 获取链表大小
    public int getSize() {
        return size;
    }

    // 判断是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 打印链表
    public void printList() {
        Node current = head.next;
        while (current != tail) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}