package º¼µçoj;

import java.util.Scanner;

public class Main1222 {

	public static int gcd(int a,int b) {
		if(a%b==0) {
			return b;
		}
		return gcd(b,a%b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {
			int T=sc.nextInt();
			while(T-->0) {
				int m=sc.nextInt();
				int n=sc.nextInt();
				if(gcd(n,m)==1) {
					System.out.println("NO");
				}else {
					System.out.println("YES");
				}
			}
		}
	}
}
