package com.yu.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 10:06 2022/1/14
 * @Modified By:
 */
public class Main {
    static int n, k;
    static int N = 100010;
    static int[] p = new int[N];   //同类
    static int[] e = new int[N];   //捕食
    static int cnt = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        k = Integer.parseInt(s[1]);
        for(int i = 1; i <= n; i++){
            p[i] = i;
        }
        while(k != 0) {
            String[] s1 = br.readLine().split(" ");
            int a = Integer.parseInt(s1[1]);
            int b = Integer.parseInt(s1[2]);
            if(s1[0].equals("1")) {
                if(a > n || b > n) {
                    cnt++;
                }
                else {
                    p[find(a)] = find(b);
                }
            } else {
                if(a == b) {
                    cnt++;
                } else {
                    e[a] = b;
                }
            }
        }
    }
    public static int find(int x) {
        if(p[x] != x) p[x] = find(p[x]);
        return p[x];
    }
    public static int eat(int x) {

    }
}