package 杭电oj;

import java.io.*;

public class Main1269 {
    static int head[], cnt, dfn[], low[], stack[], t, sum, v;
    static boolean vis[];
    static Edge edge[];

    static class Edge {
        int to, next;
    }

    static void add_edge(int x, int y) {
        edge[cnt].to = y;
        edge[cnt].next = head[x];
        head[x] = cnt++;
    }

    static void tarjan(int x) {
        dfn[x] = low[x] = cnt++;//初始化
        stack[++t] = x;       //入栈操作
        vis[x] = true;        //v[]该点已进入栈
        for (int i = head[x]; i != 0; i = edge[i].next) {
            int u = edge[i].to;           //判断该点是否被搜索过
            if (dfn[u] == 0) {
                tarjan(u);
                low[x] = Math.min(low[x], low[u]);//回溯时更新low[]
            } else if (vis[u]) {
                low[x] = Math.min(low[x], dfn[u]);
            }
        }
        if (dfn[x] == low[x]) {
            sum++;
            while (true) {
                v = stack[--t];
                vis[v] = false;
                if (v != x) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer sc = new StreamTokenizer(buf);
        while (sc.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) sc.nval;
            sc.nextToken();
            int m = (int) sc.nval;
            if (n == 0 && m == 0) {
                return;
            }
            edge = new Edge[m + 1];
            for (int i = 0; i <= m; i++) {
                edge[i] = new Edge();
            }
            head = new int[n + 1];
            vis = new boolean[n + 1];
            stack = new int[n + 1];
            dfn = new int[n + 1];
            low = new int[n + 1];
            cnt = 1;
            int a, b;
            for (int i = 0; i < m; i++) {
                sc.nextToken();
                a = (int) sc.nval;
                sc.nextToken();
                b = (int) sc.nval;
                add_edge(a, b);
            }
            cnt = 1;
            t = 0;
            sum = 0;
            for (int i = 1; i <= n; i++) {
                if (dfn[i] == 0) {
                    tarjan(i);
                }
            }
            if (sum == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
