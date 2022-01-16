package com.yu.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 22:41 2022/1/16
 * @Modified By:
 */

/**
 * 哈希之拉链法
 */
//class Main2 {
//    static int N = 100003;
//    static int[] e = new int[N];
//    static int[] ne = new int[N];
//    static int[] h = new int[N];
//    static int idx;
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    public static void main (String[] args) throws IOException {
//        Init(h);
//        int n = Integer.parseInt(br.readLine());
//        while(n-- > 0) {
//            String[] s = br.readLine().split(" ");
//            int x = Integer.parseInt(s[1]);
//            if("I".equals(s[0])) {
//                Insert(x);
//            }
//            else {
//                if(find(x))  System.out.println("Yes");
//                else System.out.println("No");
//            }
//        }
//    }
//    public static void Init(int[] arr) {
//        for (int i = 0; i < N; i++) {
//            arr[i] = -1;
//        }
//    }
//    public static boolean find(int x) {
//        int k = (x  % N + N) % N;
//        for (int i = h[k]; i != -1; i = ne[i]) {
//            if(e[i] == x) return true;
//        }
//        return false;
//    }
//    public static void Insert(int x) {
//        int k = (x  % N + N) % N;
//        e[idx] = x;
//        ne[idx] = h[k];
//        h[k] = idx++;
//    }
//
//}

/**
 * 哈希之开放寻址法
 */
class Main2 {
    static int N = 200003;   //一般为要求的2~3倍
    static int[] h = new int[N];
    static int nn = 0x3f3f;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main (String[] args) throws IOException {
        Init(h);
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[1]);
            int k = find(x);
            if("I".equals(s[0])) {
                h[k] = x;
            }
            else {
                if(h[k] != nn)  System.out.println("Yes");
                else System.out.println("No");
            }
        }
    }
    public static void Init(int[] arr) {
        for (int i = 0; i < N; i++) {
            arr[i] = nn;
        }
    }
    public static int find(int x) {
        int k = (x % N + N) % N;
        while(h[k] != nn && h[k] != x) {
            k = (k + 1) % N;
        }
        return k;
    }

}