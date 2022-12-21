package com.viewhigh.example.sort;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {


    public static void main(String[] args) {

        int[] array = {10, 5, 20, 99, 30, 30, 40, 50, 60, 80, 100, 22};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(array));

//        Arrays.sort(array);
        SelectSort.sort(array);
//        System.out.println("排序后：");
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            //1. 去数组的首元素为最小值
            //最小值索引
            int minIndex = i;
            //最小值
            int min = array[i];
            //2. 依次与剩余的元素比较
            for (int j = i + 1; j < array.length; j++) {
                //3. 记录遍历中的最小值
                if (min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }
            //3.进行交换
            array[minIndex] = array[i];
            array[i] = min;
        }

    }

}
