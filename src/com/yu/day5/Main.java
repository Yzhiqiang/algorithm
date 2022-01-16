package com.yu.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 10:01 2022/1/16
 * @Modified By:
 */
public class Main {
    static int N = 100010;
    static int[][] b = new int[10][5];
    static int[] arr = new int[N]; // 堆
    static int[] ph = new int[N];   //第k个点插入的下标
    static int[] hp = new int[N];   //存放堆中点插入的次序
    static int size;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println(b.length);
        int n = br.read();
        size = 0;
        int m = 0;
        while(n-- > 0) {
            String[] s = br.readLine().split(" ");
            if(s[0].equals("I")) {
                arr[++size] = Integer.parseInt(s[1]);
                ph[++m] = size;
                hp[size] = m;
                up(size);
            }
            else if(s[0].equals("PM")) {
                System.out.println(arr[1]);
            }
            else if(s[0].equals("D")) {
                int k = Integer.parseInt(s[1]);
                int u = ph[k];
                heapSwap(u, size);
                size--;
                up(u);
                down(u);
            }
            else if(s[0].equals("C")) {
                int k = Integer.parseInt(s[1]);
                int x = Integer.parseInt(s[2]);
                arr[ph[k]] = x;
                down(ph[k]);
                up(ph[k]);
            }
            else if("DM".equals(s[0])){
                heapSwap(1,size);
                size--;
                down(1);
            }
        }
    }
    public static void down(int k) {
        int min = k, a = 2 * k, b = 2 * k + 1;
        if(a <= size && arr[a] < arr[min]) {
            min = a;
        }
        if(b <= size && arr[b] < arr[min]) {
            min = b;
        }
        if(min != k) {
            heapSwap(min, k);
            down(min);
        }
    }
    public static void up(int k) {
        int u = k / 2;
        if(u > 0 && arr[u] > arr[k]) {
            heapSwap(k, u);
            up(u);
        }
    }
    public static void heapSwap(int i, int j) {
        swap(arr,i, j);
        swap(hp, i, j);
        swap(ph, hp[i], hp[j]);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
