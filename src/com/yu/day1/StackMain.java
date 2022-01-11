package com.yu.day1;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 21:50 2022/1/11
 * @Modified By:
 */
public class StackMain {
    private static int N = 100010;
    private static int arr[] = new int[N];
    private static int min[] = new int[N];
    private static Stack<Integer> S = new Stack<Integer>();
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
           if(S.isEmpty()){
               min[i] = -1;
               S.push(arr[i]);
           }else {
               if(arr[i] > S.peek()){
                   min[i] = S.peek();
                   S.push(arr[i]);
               }
               else {
                   while(!S.isEmpty() && S.peek() >= arr[i]) {
                       S.pop();
                   }
                   if(S.isEmpty()) {
                       min[i] = -1;
                   }
                   else {
                       min[i] = S.peek();
                   }
                   S.push(arr[i]);
               }
           }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(min[i] + " ");
        }
    }
}