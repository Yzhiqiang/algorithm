package com.yu.day11;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 19:40 2022/1/24
 * @Modified By:
 */
public class Main {
    public static void main(String[] args) {
        String s = "   hello, world!   day    aa";
        s = s.trim();
        String[] s1 = s.split(" ");
        for (String s2 : s1) {
            if(s2 != "\\\\s+")
            System.out.println(s2);
        }
    }
}
