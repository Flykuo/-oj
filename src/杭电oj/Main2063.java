package ����oj;

import java.util.*;

public class Main2063 {

	public static int max = 501, a[] = new int[max], b[] = new int[max], arr[][] = new int[max][max], n, m;

	public static boolean find(int x) {
		for (int i = 1; i <= n; i++) {
			if (arr[x][i] == 1 && b[i] == 0) {// �й�ϵ������û�б�ѡ
				b[i] = 1;// ����Ѿ���ѡ
				if (a[i] == 0 || find(a[i])) {// û��ѡ��Ů�� ���߿��Ը���Ů��
					a[i] = x;
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int k = sc.nextInt();
			if (k == 0) {
				return;
			}
			m = sc.nextInt();
			n = sc.nextInt();
			for(int i=0;i<501;i++) {
				Arrays.fill(arr[i],0);
			}
			Arrays.fill(a, 0);
			Arrays.fill(b, 0);
			for (int i = 0; i < k; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				arr[x][y] = 1;
			}
			int sum = 0;
			for (int i = 1; i <= m; i++) {
				Arrays.fill(b, 0);
				if (find(i)) {
					sum++;
				}
			}
			System.out.println(sum);
		}
	}
}
