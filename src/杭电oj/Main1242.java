package 杭电oj;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main1242 {

	static int ans, n, m;
	static int vis[][] = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			n = sc.nextInt();
			m = sc.nextInt();
			char map[][] = new char[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = sc.next().toCharArray();
			}
			PriorityQueue<Edge> q = new PriorityQueue<>(new Comparator<Edge>() {
				@Override
				public int compare(Edge edge, Edge t1) {
					return edge.sum - t1.sum;
				}
			});
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (map[i][j] == 'a') {
						q.add(new Edge(i, j, 0));
						break;
					}
				}
			}
			ans = -1;
			while (!q.isEmpty()) {
				Edge now = q.poll();
				if (map[now.x][now.y] == 'r') {
					ans = now.sum;
					break;
				}
				map[now.x][now.y] = '#';
				int x, y;
				for (int i = 0; i < 4; i++) {
					x = now.x + vis[i][0];
					y = now.y + vis[i][1];
					if (x >= 0 && x < n && y >= 0 && y < m && map[x][y] != '#') {
						if (map[x][y] == 'x') {
							q.add(new Edge(x, y, now.sum + 2));
						} else {
							q.add(new Edge(x, y, now.sum + 1));
						}
					}
				}
			}
			if (ans == -1) {
				System.out.println("Poor ANGEL has to stay in the prison all his life.");
			} else {
				System.out.println(ans);
			}
		}
		sc.close();
	}

	static class Edge {
		int x, y, sum;

		Edge(int x, int y, int sum) {
			this.x = x;
			this.y = y;
			this.sum = sum;
		}
	}
}
