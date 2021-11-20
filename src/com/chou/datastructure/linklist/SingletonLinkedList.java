package com.chou.datastructure.linklist;

/**
 * @author Axel
 * @version 1.0
 * @className SingletonLinkedList
 * @description 链表
 * @date 2021/11/13 22:00
 */

public class SingletonLinkedList {
    // 初始化头节点
    private LinkNode head = new LinkNode(0,"");

    /**
     * 新增节点（放到最后面）
     * 1、判断节点的next 是否为空 如果为空则 使用next 指向新的节点
     */
    public void add(LinkNode element){
        LinkNode temp = head;
        while (true){
            if(temp.next== null){
                //如果没有下一个节点跳出
                break;
            }
            // 将temp 后移
            temp = temp.next;
        }
        temp.next = element;
    }

    /**
     * 顺序增加节点信息
     * 思路 1，使用中间变量head 值
     *     2，
     */
    public void orderByAdd(LinkNode element){
        LinkNode temp = head;
        // 标识是否有新怎的的节点
        boolean flag = false;
        while(true){
            if(temp.next == null){
                // 已经是最后面一个节点
                break;
            }
            if(temp.next.no > element.no){
                break;
            }else if(temp.next.no == element.no){
                flag = true;
            }
            // 遍历节点
            temp = temp.next;
        }
        if(flag){
            // 不能添加已经存在该节点了
            System.out.println("已有存在的节点信息...");
        }else {
            element.next = temp.next;
            // 把前一个节点指向需要添加的节点
            temp.next = element;
        }

    }

    /**
     * 删除某个元素
     */

    private void remove(int no){

    }



    /**
     * 遍历节点
     */
    public void list(){
        if(head.next == null){
            System.out.println("链表中没有元素...");
            return;
        }
        // 如果头结点的next 有指向下一个元素
        LinkNode temp = head.next;
        while (true){
            // 判断是否为空
            if(null == temp){
                break;
            }
            // 输出值
            System.out.println(temp);

            // 将temp 后移遍历后面的值
            temp = temp.next;
        }
    }
}
