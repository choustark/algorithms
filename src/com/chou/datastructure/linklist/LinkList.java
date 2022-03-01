package com.chou.datastructure.linklist;


/**
 * @author Axel
 * @version 1.0
 * @className LinkList
 * @description 基础的链表数据结构（无虚拟头结点）
 * @date 2022/1/23 14:34
 */

public class LinkList<E> {

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
    private Node head;

    public LinkList() {
        head = null;
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
     * 在链表的头部添加元素
     * @param e
     */
    public void  addFist(E e){
        //Node node = new Node(e);
        //node.next = head;
        //head = node;
        //size ++;
        head = new Node(e,head);
        size ++;
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
        if(index == 0){
            // 在头节点增加
            addFist(e);
        }else {
            Node prev = head;
            // 从第一个节点开始循环
            for (int i = 0; i < index -1 ; i++) {
                // 如果当前节点位置前于需要添加的节点则需要将 prev 的下一个节点赋值给prev 直至循环结束
                prev = prev.next;
            }
            Node node = new Node(e);
            node.next = prev.next;
            prev.next = node;
            size ++;
        }
    }

    /**
     * 在链表尾部增加节点
     * @param e
     */
    public void addLast(E e){
        add(size,e);
    }


    public E getFirst(){
        if(isEmpty()){
            return null;
        }else {
            return head.e;
        }
    }
    /**
     *
     * @param index
     * @return
     */
    public E get(int index){
        if(index < 0 || index > size){
            throw new IllegalStateException("Get() failed! index illegal");
        }
        if(index == 0){
            getFirst();
        }
        Node retNode = head;
        for (int i = 0; i <index - 1; i++) {
            retNode = head.next;
        }
        return retNode.next.e;
    }

    /**
     * 获取最后一个节点的数据
     * @return
     */
    public E getLast(){
        return get(size);
    }

    /**
     * 移除链表的第一个元素
     * @return
     */
    public E removeFirst(){
        if(isEmpty()){
            throw new IllegalStateException("removeFirst() failed! LinkedList is null");
        }else {
            return head.e;
        }
    }

    /**
     * 移除链表中某个位置的节点
     * @param index
     * @return
     */
    public E remove(int index){
        if(index < 0 || index > size){
            throw new IllegalStateException("Remove() failed! index illegal");
        }
        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            // 获取需要被删除节点的前一个节点
            prev = head.next;
        }
        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size--;
        return retNode.e;
    }

    /**
     * 移除链表的最后一个节点
     * @return
     */
    public E removeLast(){
        return remove(size);
    }

    /**
     * 链表中是否包含指定节点
     * @param e
     * @return
     */
    public boolean contain(E e){
        Node cur = head;
        while (cur.next != null){
            if(e.equals(cur.e)){
                return true;
            }
            cur = cur.next;
        }
        return false;

    }

    /**
     * 更新链表某个位置节点
     * @param index
     * @param e
     */
    public void update(int index,E e){
        if (index < 0 || index > size) {
            throw new IllegalStateException("Update() failed! index illegal");
        }
        Node cur = head;
        for (int i = 0; i < index - 1; i++) {
            cur = head.next;
        }
        cur.e = e;
    }

    @Override
    public String toString(){
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append("LinkedList size ={}");
        Node cur = head;
        while (null != cur){
            resultBuilder.append(cur).append("-->");
            cur = cur.next;
        }
        return resultBuilder.toString();
    }



}
