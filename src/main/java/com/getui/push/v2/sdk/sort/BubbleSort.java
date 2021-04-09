package com.getui.push.v2.sdk.sort;

/**
 * @description: 冒泡排序
 * @author: ruanxs
 * @create: 2021-04-09 10:18
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] source = new int[]{3, 2, 5, 6, 1};
        sort(source, 5);
        for (int i = 0; i < 5; i++) {
            System.out.print(source[i]);
        }
    }

    private static void sort(int[] source, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (source[j] > source[j + 1]) {
                    int temp = source[j];
                    source[j] = source[j + 1];
                    source[j + 1] = temp;
                }
            }
        }
    }
}
