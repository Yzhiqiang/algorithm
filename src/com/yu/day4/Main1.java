package com.yu.day4;

import java.util.Arrays;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 14:13 2022/1/15
 * @Modified By:
 */
public class Main1 {
    public static void main(String[] args) {
        int arr[] = {0};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        for(int i = 0; i < nums.length + 1; i++) {
            if(nums[i] != i) return i;
        }
        return -1;
    }
}
