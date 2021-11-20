package com.chou.datastructure.linklist;

/**
 * @author Axel
 * @version 1.0
 * @className Node
 * @description TODO
 * @date 2021/11/13 22:00
 */

public class LinkNode {
    public int no;
    public String name;
    // 指向下一个节点
    public LinkNode next;
    public LinkNode() {
    }
    public LinkNode(int no, String name) {
        this.no = no;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Node{" + "no=" + no + ", name='" + name  + '}';
    }
}
