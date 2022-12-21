package com.viewhigh.example.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    private static int number = 0;

    public static void main(String[] args) {

        int[] array = {10, 5, 20, 99, 30, 30, 40, 50, 60, 80, 100, 22};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(array));

//        Arrays.sort(array);
        BubbleSort.sort(array);
        System.out.println("共经过" + number + "轮冒泡排序");
//        System.out.println("排序后：");
        System.out.println(Arrays.toString(array));
    }


    public static void sort(int[] array) {
        //外层控制循环的次数
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            number++;
        }
    }
}
