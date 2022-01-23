package com.yu.day10;

import java.util.LinkedList;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 16:54 2022/1/23
 * @Modified By:
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer, Boolean> hash =
    }
}
#include<bits/stdc++.h>
        using namespace std;

        const int N=1100;
        int f[N][N];  //只从前i组物品中选，当前体积小于等于j的最大值
        int v[N],w[N],s[N];   //v为体积，w为价值，s代表第i组物品的个数
        int n,m,k;

        int main(){
        int cnt = 1;
        cin>>n>>m;
        for(int i=1;i<=n;i++){
        cin>>s[i];
        for(int j=0;j<s[i];j++){
        cin>>v[cnt]>>w[cnt];  //读入
        cnt++;
        }
        }
        int x = 0;
        for(int i=1;i<=n;i++){
        for(int j=0;j<=m;j++){
        f[i][j]=f[i-1][j];  //不选
        for(int k=1;k<=s[i];k++){
        if(j>=v[x + k])     f[i][j]=max(f[i][j],f[i-1][j-v[x + k]]+w[x + k]);
        }
        }
        x += s[i];
        }
        cout<<f[n][m]<<endl;
        }