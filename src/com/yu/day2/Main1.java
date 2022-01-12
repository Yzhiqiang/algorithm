package com.yu.day2;

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
public class Main1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n, m;
    public static void main(String[] args) throws IOException {
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        Map<String, String> hash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Integer j = i + 1;
            hash.put(j.toString(), j.toString());
        }
        for (int i = 0; i < m; i++) {
            String[] str = br.readLine().split(" ");
            if(str[0].equals("M")) {
                hash.put(hash.get(str[1]), hash.get(str[1]) + hash.get(str[2]));
                hash.put(hash.get(str[2]), hash.get(str[1]) + hash.get(str[2]));
            }
            else {
                String res = hash.get(str[1]);
                if(res.contains(str[1]) && res.contains(str[2])) {
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }
        }

    }
}
