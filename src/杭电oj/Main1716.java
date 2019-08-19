package 杭电oj;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1716 {

	public static Set<String> set = new HashSet<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int aa = 0;
		while (sc.hasNext()) {
			int n = 4;
			int a[] = new int[4];
			int sum = 0;
			for (int i = 0; i < 4; i++) {
				a[i] = sc.nextInt();
				if (a[i] == 0) {
					sum++;
				}
			}
			if (sum == 4) {
				return;
			}
			Arrays.sort(a);
			pai(a, 0);
			String b = set.toString().replace("[", "").replace(",", "").replace("]", "");
			String c[] = b.split(" ");
			Arrays.sort(c);
			int d[] = new int[c.length];
			for (int i = 0; i < d.length; i++) {
				d[i] = Integer.parseInt(c[i]);
			}
			int num=0;
			if(aa!=0) {
				System.out.println();
			}
			for(int i=1;i<d.length;i++) {
				if(d[i-1]/1000==d[i]/1000) {
					System.out.print(d[i-1]+" ");
				}else {
					System.out.println(d[i-1]);
				}
			}
			System.out.println(d[d.length-1]);
			aa=1;
			set.clear();
		}
	}

	public static void pai(int arr[], int start) {
		if (start == arr.length && arr[0] != 0) {
			set.add(Arrays.toString(arr).replace("[", "").replace(",", "").replace("]", "").replace(" ", ""));
		} else {
			for (int i = start; i < arr.length; i++) {
				swap(arr, start, i);
				pai(arr, start + 1);
				swap(arr, start, i);
			}
		}
	}

	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}