package com.getui.push.v2.sdk.sort;

/**
 * @description: 归并排序
 * @author: ruanxs
 * @create: 2021-04-09 15:50
 **/
public class MergeSort {
    public static void main(String[] args) {
        int[] source = new int[]{3, 2, 5, 6, 1};
        int[] temp = new int[source.length];
        sort(source, 0, 4, temp);
        for (int i = 0; i < 5; i++) {
            System.out.print(source[i]);
        }
    }

    private static void sort(int[] resource, int start, int end, int[] temp) {
        if (start < end) {
            int mid = (end + start) / 2;
            sort(resource, start, mid, temp);
            sort(resource, mid + 1, end, temp);
            merge(resource, start, mid, end, temp);
        }
    }

    private static void merge(int[] resource, int start, int mid, int end, int[] temp) {
        int i = start;
        int j = mid + 1;
        int t = 0;
        while (i <= mid && j <= end) {
            if (resource[i] <= resource[j]) {
                temp[t++] = resource[i++];
            } else {
                temp[t++] = resource[j++];
            }
        }
        //左边还有剩余的，复掉到临时数组
        while (i <= mid) {
            temp[t++] = resource[i++];
        }
        //右边还有剩余的，复掉到临时数组
        while (j <= end) {
            temp[t++] = resource[j++];
        }
        t = 0;
        //临时数组复制到原数组
        while (start <= end) {
            resource[t++] = temp[start++];
        }
    }
}
