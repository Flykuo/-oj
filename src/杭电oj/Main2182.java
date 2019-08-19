package 杭电oj;

import java.util.Scanner;

public class Main2182 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {
			int t=sc.nextInt();
			while(t-->0) {
				int n=sc.nextInt();
				int a=sc.nextInt();
				int b=sc.nextInt();
				int k=sc.nextInt();
				int arr[]=new int[n];
				int dp[][]=new int[110][110];
				for(int i=0;i<n;i++) {
					arr[i]=sc.nextInt();
				}
				for(int i=0;i<n;i++) {
					for(int j=1;j<=k;j++) {
						for(int r=i+a;r<=i+b&&r<n;r++) {
							dp[r][j]=Math.max(dp[r][j],dp[i][j-1]+arr[r]);
						}
					}
				}
				System.out.println(dp[n-1][k]+arr[0]);
			}
		}
	}
}
