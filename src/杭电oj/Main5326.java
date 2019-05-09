package º¼µçoj;

import java.util.*;

public class Main5326{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt(), k = sc.nextInt(), arr[][] = new int[n][n], a[] = new int[n], b[] = new int[n], x = 0,
					y = 0;
			for (int i = 0; i < n - 1; i++) {
				x = sc.nextInt() - 1;
				y = sc.nextInt() - 1;
				if (arr[y][x] == 0) {
					arr[y][x] = 1;
					a[x]++;
				}
			}
			Queue<Integer> s = new LinkedList<>();
			for (int i = 0; i < n; i++) {
				if (a[i] == 0) {
					s.add(i);
				}
			}
			int index, ans = 0;
			while (!s.isEmpty()) {
				index = s.poll();
				for (int i = 0; i < n; i++) {
					if (arr[index][i] == 1) {
						a[i]--;
						b[i]+=1+b[index];
						if (a[i] == 0) {
							s.add(i);
						}
					}
				}
			}
			for(int i=0;i<n;i++) {
				if(b[i]==k) {
					ans++;
				}
			}
			System.out.println(ans);
		}
		sc.close();
	}
}
