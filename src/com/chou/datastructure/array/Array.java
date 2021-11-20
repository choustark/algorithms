package com.chou.datastructure.array;


/**
 * @ClassName ArrayStructure
 * @Description 数组
 * @Author Axel
 * @Date 2021/8/28 23:28
 * @Version 1.0
 */

public class Array<E> {

    private int size;
    private E[] data;

    /**
     * 初始化构造函数
     */
    public Array() {
        this(10);
    }

    /**
     * 初始化数组容量大小构造函数
     *
     * @param capacity
     */
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }


    /**
     * 获取数组的大小
     *
     * @return
     */
    public int getSize() {
        return this.size;
    }

    /**
     * 获取数据的容量
     *
     * @return
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * 判断输出是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return getSize() == 0;
    }

    /**
     * 在数组末尾添加元素
     *
     * @param element
     */
    public void addLast(E element) {
        add(size, element);
    }


    /**
     * 在任意index位置添加元素
     *
     * @param index
     * @param element 4,5,3,2,1,6
     */
    public void add(int index, E element) {
        if (index == getCapacity()) {
            throw new RuntimeException("Add failed,this Array is full");
        }
        if (index < 0 || index > size) {
            throw new RuntimeException("Add element is failed,Required index >=0 and index =< size");
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = element;
        size++;
    }

    /**
     * 返回给定元素的索引值
     *
     * @param element
     * @return
     */
    public int search(E element) {
        for (int i = 0; i < size; i++) {
            if (data[i] == element) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 移除数组中的第一个元素
     *
     * @return 返回被移除的元素
     */
    public E removeFirst() {
        return remove(0);
    }

    /**
     * 移除数组的最后一个元素
     * @return
     */
    public E removeLast(){
        return remove(size-1);
    }

    /**
     * 移除数组中的index位置上元素
     *
     * @param index 索引值
     * @return 返回被移除的元素
     */
    public E remove(int index) {
        // 校验index的合法性
        if (isEmpty()) {
            throw new IllegalStateException("Remove() is failed,Array is empty!");
        }
        if (index < 0 || index > size) {
            throw new IllegalStateException("Remove() is failed,the index must to great than zero and less than size");
        }
        E oldValue = data[index];
        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return oldValue;
    }

    /**
     * 根据索引获取数组中元素
     *
     * @param index
     * @return
     */
    public E get(int index) {
        // 校验index是否合法
        if (index < 0 || index > size) {
            throw new RuntimeException("Get element is Failed,Required index >=0 and index < data.length");
        }
        return data[index];
    }

    /**
     * 获取数组中第一个元素
     * @return
     */
    public E getFirst(){
        return get(0);
    }
    /**
     * 更新索引位 index 的值
     *
     * @param index
     * @param element
     */
    public void set(int index, E element) {
        // 校验index是否合法
        if (index < 0 || index > getCapacity()) {
            throw new RuntimeException("Get element is Failed,Required index >=0 and index < data.length");
        }
        data[index] = element;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String arrInfo = String.format("Array capacity = %d size = %d", getCapacity(), getSize());
        System.out.println(arrInfo);
        sb.append("[");
        for (int i = 0; i < this.size; i++) {
            sb.append(data[i]);
            if (i != size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void setData() {
        data = (E[]) new Integer[]{1, 2, 3, 4, 5};
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
