package com.yu.day2;
import java.io.*;
import java.util.Scanner;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 10:55 2022/1/12
 * @Modified By:
 */
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N = 1000010;
    private static int[] arr = new int[N];
    private static int[] q = new int[N];
    private static int n, k;
    public static void main(String[] args) throws IOException {
        int tt = -1, hh = 0;
        String[] str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);  k = Integer.parseInt(str[1]);
       String[] s = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
            if(tt >= hh && i - k + 1 > q[hh]) hh++;
            while(tt >= hh && arr[i] <= arr[q[tt]]) tt--;
            q[++tt] = i;
            if(i + 1 >= k) bw.write(arr[q[hh]] + " ");
        }
        bw.write("\n");
        System.out.println();
        tt = -1;   hh = 0;
        for(int i = 0; i < n; i++) {
            if(tt >= hh && i - k + 1 > q[hh]) hh++;
            while(tt >= hh && arr[i] >= arr[q[tt]]) tt--;
            q[++tt] = i;
            if(i + 1 >= k) bw.write(arr[q[hh]] + " ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
