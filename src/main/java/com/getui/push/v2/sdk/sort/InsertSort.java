package com.getui.push.v2.sdk.sort;

/**
 * @description: 插入排序
 * @author: ruanxs
 * @create: 2021-04-09 10:36
 **/
public class InsertSort {
    public static void main(String[] args) {
        int[] source = new int[]{3, 2, 5, 6, 1};
        sort(source, 5);
        for (int i = 0; i < 5; i++) {
            System.out.print(source[i]);
        }
    }

    private static void sort(int[] source, int size) {
        for (int i = 1; i < size; i++) {
            int value = source[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                //和排序部分比较，小于排序部份的最大值，替换
                if (source[j] > value) {
                    source[j + 1] = source[j];
                } else {
                    //不小于最大值，肯定最大，那跳出循环
                    break;
                }
            }
            //把值插入指定位置
            source[j + 1] = value;
        }
    }
}
