package 杭电oj;

import java.util.Scanner;

public class Main1035 {
	static int n, m, count1, x, y, count2;
	static char arr[][], brr[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			n = sc.nextInt();
			m = sc.nextInt();
			if (n == 0 && m == 0) {
				return;
			}
			int flag = sc.nextInt();
			arr = new char[n][m];
			brr = new char[n][m];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.next().toCharArray();
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					brr[i][j] = arr[i][j];
				}
			}
			count1 = 0;
			count2 = 0;
			x = -1;
			y = -1;
			dfs(0, flag - 1);
			if (x == -1 && y == -1) {
				System.out.println(++count1 + " step(s) to exit");
			} else {
				dfs1(0, flag - 1);
				if (count2 == 0) {
					System.out.println("0 step(s) before a loop of " + count1 + " step(s)");
				} else {
					System.out.println(count2 + " step(s) before a loop of " + (count1 - count2) + " step(s)");
				}
			}
		}
	}

	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		if (arr[i][j] == '*') {
			// 找到出口
			x = i;
			y = j;
			return;
		}
		if (arr[i][j] == 'S') {
			if (i + 1 >= n) {
				return;
			}
			arr[i][j] = '*';
			count1++;
			dfs(i + 1, j);
		} else if (arr[i][j] == 'W') {
			if (j - 1 < 0) {
				return;
			}
			arr[i][j] = '*';
			count1++;
			dfs(i, j - 1);
		} else if (arr[i][j] == 'E') {
			if (j + 1 >= m) {
				return;
			}
			arr[i][j] = '*';
			count1++;
			dfs(i, j + 1);
		} else if (arr[i][j] == 'N') {
			if (i - 1 < 0) {
				return;
			}
			arr[i][j] = '*';
			count1++;
			dfs(i - 1, j);
		}
	}

	private static void dfs1(int i, int j) {
		// TODO Auto-generated method stub
		if (i == x && j == y) {
			return;
		}
		if (brr[i][j] == 'S') {
			count2++;
			dfs1(i + 1, j);
		} else if (brr[i][j] == 'W') {
			count2++;
			dfs1(i, j - 1);
		} else if (brr[i][j] == 'E') {
			count2++;
			dfs1(i, j + 1);
		} else if (brr[i][j] == 'N') {
			count2++;
			dfs1(i - 1, j);
		}
	}
}
