package º¼µçoj;

import java.util.*;

public class Main2094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				return;
			}
			List<String> list = new ArrayList<>();
			String a[] = new String[n];
			String b[] = new String[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.next();
				if (!list.contains(a[i])) {
					list.add(a[i]);
				}
				b[i] = sc.next();
				if (!list.contains(b[i])) {
					list.add(b[i]);
				}
			}
			int m = list.size();
			int arr[][] = new int[m][m];
			int c[] = new int[m];
			for (int i = 0; i < n; i++) {
				int x = 0, y = 0;
				for (int j = 0; j < m; j++) {
					if (list.get(j).equals(a[i])) {
						x = j;
					}
					if (list.get(j).equals(b[i])) {
						y = j;
					}
				}
				if (arr[x][y] == 0) {
					arr[x][y] = 1;
					c[y]++;
				}
			}
			int count = 0;
			for (int i = 0; i < m; i++) {
				if (c[i] == 0) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}