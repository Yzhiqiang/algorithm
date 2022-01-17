package com.yu.day6;

import java.util.*;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 10:14 2022/1/17
 * @Modified By:
 */
import java.io.*;
class Main {
    static int n, m;
    static String str;
    static int b = 131;
    static long[] h = new long[n + 10];
    static long[] p = new long[n + 10];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        str = br.readLine();
        p[0] = 1;
        for(int i = 1; i < n; i++) {
            p[i] = p[i - 1] * b;
            h[i] = h[i - 1] * b + str.charAt(i - 1);
        }
        while(m-- > 0) {
            String[] s0 = br.readLine().split(" ");
            int l1 = Integer.parseInt(s0[0]);
            int r1 = Integer.parseInt(s0[1]);
            int l2 = Integer.parseInt(s0[2]);
            int r2 = Integer.parseInt(s0[3]);
            if(getvalue(l1, r1) == getvalue(l2, r2)) System.out.println("Yes");
            else System.out.println("No");
        }
    }
    static long getvalue(int l, int r) {
        return h[r] - h[l - 1] * p[r - l + 1];
    }
}