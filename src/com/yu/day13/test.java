package com.yu.day13;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 23:22 2022/2/8
 * @Modified By:
 */
public class test {
    public static void main(String[] args) {
        String s = "ab";
        String p = ".*";
        int lena = s.length();
        int lenb = p.length();
        boolean[][] f = new boolean[lena + 1][lenb + 1];
        for(int i = 0; i <= lena; i++) {
            for(int j = 0; j <= lenb; j++) {
                if(j == 0) f[i][j] = i == 0;
                else {
                    if(p.charAt(j - 1) != '*') {
                        if(i > 0 && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.')) f[i][j] = f[i - 1][j - 1];
                    }
                    else {
                        if(j >= 2) {
                            f[i][j] = f[i][j - 2];
                        }
                        if(i >= 1 && j >= 2 && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.')) f[i][j] |= f[i - 1][j];
                    }
                }
            }
        }
    }
}
