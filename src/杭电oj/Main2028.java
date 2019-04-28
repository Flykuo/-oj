package º¼µçoj;

import java.util.Scanner;

public class Main2028 {

	public static long gcd(long a,long b) {
		long c=a%b;
		while(c!=0) {
			a=b;
			b=c;
			c=a%b;
		}
		return b;
	}
	public static long max(long a,long b) {
		long c=gcd(a,b);
		return a*b/c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n=sc.nextInt();
			long arr[]=new long[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextLong();
			}
			for(int i=1;i<n;i++) {
				arr[0]=max(arr[0],arr[i]);
			}
			System.out.println(arr[0]);
		}
	}
}
