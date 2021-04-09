package com.getui.push.v2.sdk.sort;

/**
 * @description: 选择排序
 * @author: ruanxs
 * @create: 2021-04-09 11:16
 **/
public class SelectSort {
    public static void main(String[] args) {
        int[] source = new int[]{3, 2, 5, 6, 1};
        sort(source, 5);
        for (int i = 0; i < 5; i++) {
            System.out.print(source[i]);
        }
    }

    private static void sort(int[] resource, int size) {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (resource[j] < resource[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = resource[i];
                resource[i] = resource[minIndex];
                resource[minIndex] = temp;

            }
        }
    }
}
