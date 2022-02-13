package com.chou.datastructure.linklist;

/**
 * @author Axel
 * @version 1.0
 * @className DummyHeadLinkList
 * @description 具有虚拟节点的链表
 * @date 2022/2/13 16:09
 */

public class DummyHeadLinkList<E> {

    /**
     * 节点类
     * 用户存储参数、指向下一个节点
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

    /**
     * 元素大小
     */
    private int size;

    /**
     * 节点
     */
    private Node dummyHead;

    public DummyHeadLinkList() {
        dummyHead = new Node(null,null);
        size = 0;
    }

    /**
     * 获取链表的大小
     */
    public int getLength(){
        return size;
    }


    /**
     * 链表为空判断
     * @return true or false
     */
    public Boolean isEmpty(){
        return  size == 0;
    }

    /**
     * 在链表指定位置添加元素 需要找出插入节点的前一个节点
     * @param index
     * @param e
     */
    public void add(int index,E e){
        if(index < 0 && index > size ){
            throw new IllegalStateException("Add failed. Illegal index");
        }
        Node prev = dummyHead;
        // 从第一个节点的前一个节点（虚拟节点）循环
        for (int i = 0; i < index; i++) {
            // 如果当前节点位置前于需要添加的节点则需要将 prev 的下一个节点赋值给prev 直至循环结束
            prev = prev.next;
        }
        Node node = new Node(e);
        node.next = prev.next;
        prev.next = node;
        size++;

    }

    /**
     * 在链表的头部添加元素
     * @param e
     */
    public void  addFist(E e){
        add(0,e);
    }

    /**
     * 在链表尾部增加节点
     * @param e
     */
    public void addLast(E e){
        add(size,e);
    }

    /**
     * 获取某个节点
     * @param index
     * @return
     */
    public E get(int index) {
        if (index < 0 && index > size) {
            throw new IllegalStateException("Get failed. Illegal index");
        }
        Node cur = dummyHead.next;
        //从第一个节点开始循环
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    /**
     * 获取链表的第一个节点
     * @return
     */
    public E getFirst(){
        return get(0);
    }

    /**
     * 获取链表的最后一个元素
     * @return
     */
    public E getLast(){
        return get(size-1);
    }

    /**
     * 更新某个节点数据
     * @param index
     * @param e
     */
    public void update(int index,E e){
        if(index<0 && index > size){
            throw new IllegalStateException("Update Failed,Illegal index ");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;

    }

    /**
     * 是否包含某个节点
     * @param e
     */
    public Boolean contain(E e){
        Node cur = dummyHead.next;
        while (cur != null){
            if(cur.e == e){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }


    /**
     *
     * @param index
     * @return
     */
    public E remove(int index){
        if(index<0 && index > size){
            throw new IllegalStateException("Update Failed,Illegal index ");
        }
        Node prev = dummyHead.next;
        for (int i = 0; i < index; i++) {
            // 获取需要被删除节点的前一个节点
            prev = prev.next;
        }
        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        return retNode.e;
    }

    /**
     * 移除第一个节点
     * @return
     */
    public E removeFirst(){
        return remove(0);
    }

    /**
     * 移除最后一个元素
     * @return
     */
    public E removeLast(){
        return remove(size - 1);
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
          builder.append("DummyHeadLinkList size =").append(getLength());
        for (Node cur = dummyHead.next; cur != null ; cur = cur.next){
            builder.append(cur).append("-->");
        }
        return builder.toString();
    }

}
