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
    static int[] d = new int[N];   //捕食
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
            if(a > n || b > n)  cnt++;
            else {
                int px = find(a), py = find(b);
                if (s1[0].equals("1")) {
                    if(px == py && (d[a] - d[b]) % 3 != 0) cnt++;
                    else if(px != py){
                        p[px] = py;
                        d[px] = d[b] - d[a];
                    }
                }
                else {
                   if(px == py && (d[a] - d[b] - 1) %3 != 0) cnt++;
                   else if(px != py) {
                       p[px] = py;
                       d[px] = d[b] + 1 - d[a];
                   }
                }
            }
            k--;
        }
        System.out.println(cnt);
    }
    public static int find(int x) {
        if(p[x] != x) {
            int t = find(p[x]);
            d[x] += d[p[x]];
            p[x] = t;
        }
        return p[x];
    }
}