package 杭电oj;


import java.util.Arrays;
import java.util.Scanner;

public class Main2063 {
    static final int max = 2001;
    static int cnt, head[], lk[];
    static Edge edge[];
    static boolean vis[];

    static void add_edge(int x, int y) {
        edge[cnt].to = y;
        edge[cnt].next = head[x];
        head[x] = cnt++;
    }

    static boolean find(int x) {
        for (int i = head[x]; i != -1; i = edge[i].next) {
            if (vis[edge[i].to]) {
                continue;
            }
            vis[edge[i].to] = true;
            if (lk[edge[i].to] == -1 || find(lk[edge[i].to])) {
                lk[edge[i].to] = x;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int k = sc.nextInt();
            if (k == 0) {
                return;
            }
            int m = sc.nextInt();
            int n = sc.nextInt();
            head = new int[m + 1];
            vis = new boolean[n+1];
            Arrays.fill(head, -1);
            lk = new int[n + 1];
            Arrays.fill(lk, -1);
            edge = new Edge[k+1];
            for (int i = 0; i <=k; i++) {
                edge[i] = new Edge();
            }
            cnt = 1;
            for (int i = 0; i < k; i++) {
                add_edge(sc.nextInt(), sc.nextInt());
            }
            int ans = 0;
            for (int i = 1; i <= m; i++) {
                Arrays.fill(vis,false);
                if (find(i)) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }

    static class Edge {
        int to, next;
    }
}
