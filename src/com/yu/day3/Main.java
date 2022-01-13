package com.yu.day3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 22:18 2022/1/12
 * @Modified By:
 */
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N = 100010;
    static int[] arr = new int[N];
    static int[] p = new int[N];
    static int n, m;
    public static void main(String[] args) throws IOException {
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            p[j] = j;
        }
        for (int i = 0; i < m; i++) {
            String[] str = br.readLine().split(" ");
            if(str[0].equals("M")) {
                p[find1(Integer.parseInt(str[2]))] = find1(Integer.parseInt(str[1]));
            }
            else {
                if(find1(Integer.parseInt(str[2])) == find1(Integer.parseInt(str[1]))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
//    public static int find(int x) {
//        if(p[x] != x) p[x] = find(p[x]);
//        return p[x];
//    }
    public static int find1(int y) {
        while(p[y] != y) {
            y = p[y];
        }
        return y;
    }

}
