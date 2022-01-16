package com.yu.day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 21:00 2022/1/15
 * @Modified By:
 */
//public class HeapSort {
//    static int N = 100010;
//    public static void heapSort(int[] arr) {
//        if(arr == null || arr.length == 0) {
//            return ;
//        }
//        int len = arr.length;
//        buildMaxHeap(arr, len);
//         for (int i = len - 1; i > 0; i--) {
//            swap(arr, 0, i);
//            len--;
//            heapify(arr, 0, len);   //重新构建大顶堆，因为其他节点都满嘴大顶堆，所以只需要 修改调整后的节点
//        }
//    }
//    private static void buildMaxHeap(int[] arr, int len) {   //构建大顶堆
//        //从最后一个非叶子节点开始向前遍历，调整节点性质，使之成为大顶堆
//        for(int i = (int)Math.floor(len / 2) - 1; i >= 0; i--) {
//            heapify(arr, i, len);
//        }
//    }
//    private static void heapify(int[] arr, int i, int len) {
//        //先根据堆性质，找出它左右节点的索引
//        int left = 2 * i + 1;
//        int right = 2 * i + 2;
//        //默认当前节点是最大值
//        int largestIndex = i;
//        if(left < len && arr[left] < arr[largestIndex]) {
//            largestIndex = left;
//        }
//        if(right < len && arr[right] < arr[largestIndex]) {
//            largestIndex = right;
//        }
//        if(largestIndex != i) {
//            //如果最大值不是当前非叶子节点的值， 那么就把当前节点和最大值节点值互换
//            swap(arr, i, largestIndex);
//            //因为互换之后，子节点的值就变了，如果该节点也有自己的子节点，仍需要再次调整
//            heapify(arr, largestIndex, len);
//        }
//    }
//    private static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = in.nextInt();
//        }
//        heapSort(arr);
//        for (int i = n - 1; i >= n - m; i--) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}
public class HeapSort {
    static int N = 100010;
    static int[] p = new int[N];
    static int n, m;
    static int size;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 1; i <= n; i++) {
            p[i] = in.nextInt();
        }
        size = n;
        for(int i = size / 2; i > 0 ; i--) {
            down(i);
        }
        while(m != 0) {
            System.out.print(p[1] + " ");
            p[1] = p[size];
            size--;
            down(1);
            m--;
        }
    }
    public static void down(int k) {
        int t = k;
        if(2 * k <= size && p[2 * k] < p[t]) {
            t = 2 * k;
        }
        if(2 * k + 1 <= size && p[2 * k + 1] < p[t]) {
            t = 2 * k + 1;
        }
        if(t != k) {
            int temp = p[t];
            p[t] = p[k];
            p[k] = temp;
            down(t);
        }
    }
}