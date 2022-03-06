package com.chou.datastructure.linklist;

/**
 * @author Axel
 * @version 1.0
 * @className LinkedListClient
 * @description 链表测试类
 * @date 2022/2/13 22:00
 */

public class LinkedListClient {
    public static void main(String[] args) {
        dummyHeadLink();
        //headLink();
    }

    private static void headLink() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.addFist(i);
            System.out.println(list);
        }
        list.add(list.size,999);
        System.out.println(list);
        list.addLast(666);
        System.out.println(list);
        Integer remove = list.remove(2);
        System.out.println(remove);
        System.out.println(list);
        Integer integer = list.removeFirst();
        System.out.println(integer);
        System.out.println(list);
        Integer integer1 = list.removeLast();
        System.out.println(integer1);
        System.out.println(list);
        Integer integer2 = list.get(3);
        System.out.println(integer2);
        System.out.println(list);
        list.update(3,888);
        System.out.println(list);
        boolean contain = list.contain(888);
        System.out.println(contain);
    }

    private static void dummyHeadLink() {
        DummyHeadLinkList<Integer> linkList = new DummyHeadLinkList<>();
        linkList.add(0, 1);
        linkList.addFist(2);
        linkList.addFist(4);
        Integer fistNode = linkList.get(0);
        System.out.println(fistNode);
        System.out.println(linkList);
        for (int i = 0; i < 10; i++) {
            if (i / 3 == 2) {
                linkList.addFist(i);
                System.out.println(linkList);
            }
        }
        Integer integer = linkList.get(1);
        System.out.println(integer);
        System.out.println(linkList);
        Integer last = linkList.getLast();
        System.out.println(last);
        System.out.println(linkList);
        Integer first = linkList.removeFirst();
        System.out.println(first);
        System.out.println(linkList);
        Integer integer1 = linkList.remove(1);
        System.out.println(integer1);
        System.out.println(linkList);
        Integer removeLast = linkList.removeLast();
        System.out.println(removeLast);
        System.out.println(linkList);
        linkList.update(2,7);
        System.out.println(linkList);
    }
}
