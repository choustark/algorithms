package com.chou.datastructure.queue;

import java.util.Scanner;

/**
 * @ClassName ArrayQueueDemo
 * @Description 队列 先进先出的模式  使用数组来模拟队列的实现
 * 1、队列属性
 * 2、初始化队列
 * 3、判断队列是否满了
 * 4、增加元素
 * 5、获取队列中的元素
 * 6、打印队列信息
 * @Author Axel
 * @Date 2021/4/26 0:02
 * @Version 1.0
 */

public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
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
                case 'e':
                    System.out.println("程序退出....");
                    System.exit(0);
                    /*scanner.close();
                    loop =false;*/
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
                default:
            }
        }
        System.out.println("程序退出...");

    }

}
/**
 * 数组模拟队列
 * 存在问题创建的数组没有达到复用的效果 只能使用一次
 */

class ArrayQueue{
    // 该队列的最大长度
    private int maxSize;
    // 标明队列的开头
    private int front;
    // 标明队列的结尾
    private int rear;
    // 数组
    private int[] arr;

    // 构造行数初始化数组
    public ArrayQueue(int arrMaxSize){
        this.maxSize = arrMaxSize;
        this.front = -1;
        this.rear = -1;
        this.arr = new int[maxSize];
    }

    /**
     * 判断队列是否已经满了
     * @return
     */
    public boolean isFull(){
        return maxSize - 1 == rear;
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
        rear++; // rear后移
        arr[rear] = n;
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
        front++; // front 后移
        return arr[front];
    }

    /**
     * 获取队列
     */
    public void queryQueue(){
        if(isEmpty()){
            System.out.println("队列中还没数据....");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n",i,arr[i]);
        }
    }


    /**
     * 获取队列头部信息
     * @return
     */
    public int peekQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列中没有数据输出");
        }
        return arr[front+1];
    }
}

