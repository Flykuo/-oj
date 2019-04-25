package º¼µçoj;

import java.util.Scanner;

public class Main1527 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int min=Math.min(n, m);
			int max=Math.max(n, m);
			double k=max-min;
			if(min==(int)(k*(Math.sqrt(5)+1)/2)) {
				System.out.println("0");
			}else {
				System.out.println("1");
			}
		}
	}
}
