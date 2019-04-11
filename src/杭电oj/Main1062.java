package º¼µçoj;

import java.util.*;

public class Main1062 {
	public static void print(String a) {
		for (int i = a.length() - 1; i >= 0; i--) {
			e++;
			System.out.print(a.charAt(i));
		}
	}

	static int e = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int T = sc.nextInt();
			sc.nextLine();
			while (T-- > 0) {
				String a = sc.nextLine();
				int c = a.length();
				String b[] = a.split(" ");
				int d = b.length;
				for (int i = 0; i < b.length; i++) {
					if (i == 0) {
						print(b[i]);
					} else {
						System.out.print(" ");
						print(b[i]);
					}
				}
				d += e;
				if (d == c) {
					System.out.println();
				} else {
					for (int i = 0; i < c - d; i++) {
						System.out.print(" ");
					}
					System.out.println();
				}
				e = -1;
			}
		}
	}
}