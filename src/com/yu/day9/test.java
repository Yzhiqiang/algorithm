package com.yu.day9;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 20:37 2022/1/21
 * @Modified By:
 */
public class test {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(10, 1);
        map.put(5, 0);
        map.put(15, 2);
        map.put(30,6);
        map.put(1, 9);
        for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}
