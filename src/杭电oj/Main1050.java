package º¼µçoj;

import java.util.Arrays;
import java.util.Scanner;

public class Main1050 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {
			int T=sc.nextInt();
			int arr[]=new int[401];
			while(T-->0) {
				Arrays.fill(arr, 0);
				int n=sc.nextInt(),ans=0,x=0,y=0;
				for(int i=0;i<n;i++) {
					int a=sc.nextInt();
					int b=sc.nextInt();
					if(a%2==0) {
						a--;
					}
					if(b%2==0) {
						b--;
					}
					x=Math.min(a, b);
					y=Math.max(a, b);
					for(int j=x;j<=y;j++) {
						arr[j]++;
						if(ans<arr[j]) {
							ans=arr[j];
						}
					}
				}
				System.out.println(ans*10);
			}
		}
	}
}
