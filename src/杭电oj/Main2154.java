package 杭电oj;

import java.util.Scanner;

public class Main2154 {
	public static void main(String[] args) {
		int a[] = new int[1001];
		a[1] = 0;
		a[0] = 1;
		for (int i = 2; i <= 1000; i++) {
			a[i] = (a[i - 1] + 2 * a[i - 2]) % 10000;
		}
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				return;
			}
			System.out.println(a[n]);
		}
	}

}
