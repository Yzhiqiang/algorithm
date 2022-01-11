package com.yu.day1;

import java.util.Scanner;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 20:54 2022/1/11
 * @Modified By:
 */
public class Demo {
    private static int N = 100010;
    private static int idx = 0;
    private static int[] e = new int[N];
    private static int[] l = new int[N];
    private static int[] r = new int[N];
    //初始化
    public void init() {
        // 0表示左端点，1表示右端点
         r[0] = 1;
         l[1] = 0;
         idx = 2;
    }
    public void add(int k, int x) {
        e[idx] = x;
        r[idx] = r[k];
        l[idx] = k;
        l[r[k]] = idx;
        r[k] = idx;
        idx++;
    }

    //删除第k个节点
    public void delete(int k) {
        r[l[k]] = r[k];
        l[r[k]] = l[k];
    }
    public static void main(String[] args) {
        Demo demo = new Demo();
        int m, x, k;
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        demo.init();
        while (m != 0) {
            String str = in.next();
            if(str.equals("R")) {
                x = in.nextInt();
                demo.add(l[1], x);
            }
            else if (str.equals("L")) {
                x = in.nextInt();
                demo.add(0, x);
            }
            else if(str.equals("D")) {
                k = in.nextInt();
                demo.delete(k + 1);
            }
            else if(str.equals("IL")) {
                k = in.nextInt();
                x = in.nextInt();
                demo.add(l[k + 1], x);
            } else {
                k = in.nextInt();
                x = in.nextInt();
                demo.add(k + 1, x);
            }
            m--;
        }
        for (int i = r[0]; i != 1; i = r[i]) {
            System.out.print(e[i] + " ");
        }
    }
}
