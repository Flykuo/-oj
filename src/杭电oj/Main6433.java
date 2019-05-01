package º¼µçoj;

import java.math.BigInteger;
import java.util.Scanner;

public class Main6433 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int T = sc.nextInt();
			while (T-- > 0) {
				int n = sc.nextInt();
				BigInteger sum = new BigInteger("1");
				for (int i = 0; i < n; i++) {
					sum = sum.multiply(BigInteger.valueOf(2));
				}
				System.out.println(sum);
			}
		}
	}
}
