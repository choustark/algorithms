package com.chou.datastructure.array;

/**
 * @ClassName SparseArray
 * @Description 五子棋棋盘记录 白（1） 黑 （2） 的位置 二维数组 ——> 稀疏数组 ——> 二维数组
 * 作用于需要大部分数据是无效 记录有效值的情况
 * @Author Axel
 * @Date 2021/4/12 21:54
 * @Version 1.0
 */

public class SparseArray {
    public static void main(String[] args) {
        // ========================== 创建二维数组 =========================
        // 创建二位数组
        int[][] array = new int[11][11];
        array[2][1] = 1;
        array[3][2] = 2;
        array[1][0] = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d\t",array[i][j]);
            }
            System.out.println();
        }

        // 计算 二位数组中有值的个数
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] !=0){
                    sum ++;
                }
            }
        }
        System.out.println(sum);

        // 创建稀疏数组
        int[][] sparseArr = new int[sum+1][3];
        // 给稀疏数组赋值
        sparseArr[0][0] = array.length;
        sparseArr[0][1] = array.length;
        sparseArr[0][2] = sum;

        // 将array 数组中的有效数据放进sparse中
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] != 0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = array[i][j];
                }
            }
        }

        // 输出稀疏数组
        System.out.println("得到的稀疏数组 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i < sparseArr.length; i++) {
                System.out.printf("%d\t%d\t%d\t" ,sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
            System.out.println();
        }

        System.out.println("将稀疏数组还原成原来的数组 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // 读取第一行还原之前的数组
        array = new int[sparseArr[0][0]][sparseArr[0][1]];
        // 循环稀疏数组的值 填充 array
        for (int i = 1; i < sparseArr.length; i++) {
            array[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        // 输出还原的后的数组
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.printf("%d\t",anInt);
            }
            System.out.println();
        }

        //


    }
}
