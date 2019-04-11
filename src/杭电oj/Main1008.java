package º¼µçoj;

import java.util.Scanner;

public class Main1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				return;
			}
			int arr[] = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int index = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i] > index) {
					sum += (arr[i] - index) * 6;
				} else {
					sum += (index - arr[i]) * 4;
				}
				sum += 5;
				index = arr[i];
			}
			System.out.println(sum);
		}
	}

}
