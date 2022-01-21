package com.yu.day9;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 11:02 2022/1/21
 * @Modified By:
 */
public class Main {
    public static void main(String[] args) {
        String s = "pwwkew";
        int max = 0, k = 0;
        Map<Character, Boolean> hash = new HashMap<>();
        hash.put('a',true);
        System.out.println(hash.get('a'));
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(hash.get(ch) == null) {
                k++;
                hash.put(ch, true);
            }
            else {
                hash.clear();
                hash.put(ch, true);
                k = 1;
            }
            if(k > max) max = k;
        }
        System.out.println(max);
    }
}
