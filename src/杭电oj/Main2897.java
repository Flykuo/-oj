package º¼µçoj;

import java.util.Scanner;

public class Main2897 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int p=sc.nextInt();
			int q=sc.nextInt();
			if(n%(p+q)>=1&&n%(p+q)<=p) {
				System.out.println("LOST");
			}else {
				System.out.println("WIN");
			}
		}
	}
}
