package com.yu.day8;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Main {
    static int N = 110;
    static int m, n;
    static int[][] map = new int[N][N];
    static int[][] d = new int[N][N];
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                map[i][j] = in.nextInt();
            }
        }
        System.out.println(bfs());
    }
    public static int bfs() {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        Queue<Point> queue = new LinkedList<Point>();
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                d[i][j] = -1;
        Point p0 = new Point(0, 0);
        queue.offer(p0);   d[0][0] = 0;
        while(!queue.isEmpty()) {
            Point p = queue.poll();
            for(int i = 0; i < 4; i++) {
                Point p1 = new Point(p.x + dx[i], p.y + dy[i]);
                if(p1.x < n && p1.x >= 0 && p1.y < m && p1.y >= 0 &&  map[p1.x][p1.y] == 0 && d[p1.x][p1.y] == -1) {
                    queue.offer(p1);
                    d[p1.x][p1.y] = d[p.x][p.y] + 1;
                }
            }
        }
        return d[m - 1][n - 1];
    }
}
class Point {
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}