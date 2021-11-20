package com.chou.datastructure.queue;

import java.util.Scanner;

/**
 * @ClassName CircleArrayDemo
 * @Description TODO
 * @Author Axel
 * @Date 2021/5/2 17:01
 * @Version 1.0
 */

public class CircleArrayDemo {
    public static void main(String[] args) {
        CircleQueue arrayQueue = new CircleQueue(3);
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        //输出一系列菜单
        while (loop){
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 从队列中取出数据");
            System.out.println("h(head): 查询队列头的数据");
            key = scanner.next().charAt(0); // 输入一个字节
            switch (key){
                case 's':
                    arrayQueue.queryQueue();
                    break;
                case 'a':
                    System.out.println("请输入一个数据");
                    int i = scanner.nextInt();
                    arrayQueue.addQueue(i);
                    break;
                case 'g':
                    try{
                        int value = arrayQueue.getQueue();
                        System.out.printf("取出的数据是%d\n",value);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try{
                        int value = arrayQueue.peekQueue();
                        System.out.printf("取出的头部数据是%d\n",value);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    System.out.println("程序退出....");
                    System.exit(0);
                    /*scanner.close();
                    loop =false;*/
                    break;
                default:
            }
        }
        System.out.println("程序退出...");
    }
}

class  CircleQueue {

    private final int maxSize;
    // front 指向的是队列的第一个元素， 初始值为0
    private int front;
    // rear 指向的是队列的最后一个元素的后一个位置 初始值为 0
    private int rear;
    private final int[] arr;

    public CircleQueue(int maxSize) {
        this.maxSize = maxSize;
        this.front =  0;
        this.rear =  0;
        // 需要预留出一个位置，避免越界
        this.arr = new int[maxSize + 1];
    }

    /**
     * 判断队列是否已经满了
     * @return
     */
    public boolean isFull(){
        return (rear + 1) % maxSize == front;
    }

    /**
     * 判断队列是否空
     * @return
     */
    public boolean isEmpty(){
        return front == rear;
    }

    /**
     * 往队列中添加元素
     * @param n
     */
    public void addQueue(int n){
        if(isFull()){
            System.out.println("队列已经满了不能加了");
            return;
        }
        arr[rear] = n;
        rear = rear + 1 % maxSize;
    }

    /**
     * 获取数据
     * @return
     */
    public int getQueue(){
        // 判断队列是否为空
        if(isEmpty()){
            throw new RuntimeException("队列中没有数据，请添加数据");
        }
        int value = arr[front];
        // front 后移
        front = (front + 1) % maxSize;
        return  value;
    }

    /**
     * 获取队列
     */
    public void queryQueue() {
        if (isEmpty()) {
            System.out.println("队列中还没数据....");
            return;
        }
        for (int i = front; i < front + size(); i++) {
            System.out.printf("arr[%d] = %d\n", i % maxSize, arr[1 % maxSize]);
        }
    }

    /**
     * 当前队列中元素的个数
     * @return
     */
    public int size() {
        return (rear + maxSize - front) / maxSize;
    }

    /**
     * 获取队列头部信息
     * @return
     */
    public int peekQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列中没有数据输出");
        }
        return arr[front];
    }
}
