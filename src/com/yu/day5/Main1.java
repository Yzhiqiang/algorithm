package com.yu.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 18:34 2022/1/16
 * @Modified By:
 */
public class Main1 {
    public static void main(String[] args) throws IOException {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
    public static char firstUniqChar(String s) {
       Map<Character, Boolean> dic = new LinkedHashMap<>();
        char[] chars = s.toCharArray();
        for(char ch:chars) {
            dic.put(ch, !dic.containsKey(ch));
        }
        for(Map.Entry<Character, Boolean> d : dic.entrySet()) {
            if(d.getValue()) return d.getKey();
        }
        return ' ';
    }
}
//    public static char firstUniqChar(String s) {
//        if(s.equals("")) return ' ';
//        int[] arr = new int[26];
//        for(int i = 0; i < s.length(); i++) {
//            arr[s.charAt(i) - 97]++;
//        }
//        for(int i = 0; i < s.length(); i++) {
//            if(arr[s.charAt(i) - 97] == 1) return s.charAt(i);
//        }
//        return ' ';
//    }


//    public static char firstUniqChar(String s) {
//        Map<Character, Integer> hash = new HashMap<Character, Integer>();
//        Queue<Pair> Q = new LinkedList<Pair>();
//        int len = s.length();
//        for(int i = 0; i < len; i++) {
//            char ch = s.charAt(i);
//            if(!hash.containsKey(ch)) {
//                hash.put(ch, i);
//                Q.add(new Pair(ch, i));
//            }
//            else {
//                hash.put(ch, -1);
//                while(!Q.isEmpty() && hash.get(Q.peek().ch) == -1) {
//                    Q.poll();
//                }
//            }
//        }
//        return Q.isEmpty() ? ' ' : Q.peek().ch;
//    }
//}
//class Pair {
//    char ch;
//    int pos;
//    Pair(char ch, int pos) {
//        this.ch = ch;
//        this.pos = pos;
//    }
//}
//

