package º¼µçoj;

import java.util.*;

public class Main1081 {

	public static int a = 0x3f3f3f3f;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int arr[][] = new int[n + 1][n + 1];
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					arr[i][j] = sc.nextInt();
					arr[i][j] += arr[i][j - 1];
				}
			}
			int ans = -a;
			for (int i = 1; i <= n; i++) {
				for (int j = i; j <= n; j++) {
					for (int k = 1, res = 0; k <= n; k++) {
						res += arr[k][j] - arr[k][i - 1];
						if (res < 0) {
							res = 0;
						}
						ans = Math.max(ans, res);
					}
				}
			}
			System.out.println(ans);
		}
	}
}
