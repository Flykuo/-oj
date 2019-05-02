package º¼µçoj;

import java.util.Scanner;

public class Main6043 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int index=0;
		while(sc.hasNext()) {
			index++;
			long n=sc.nextLong();
			long m=sc.nextLong();
			System.out.print("Case #"+index+": ");
			if(m<=n) {
				System.out.println(m);
			}else {
				m-=n;
				long a=m/(n-1);
				long b=m%(n-1);
				if(a%2==0) {
					if(b==0) {
						System.out.println(n);
					}else {
						System.out.println(b);
					}
				}else {
					if(b==0) {
						System.out.println(n-1);
					}else {
						System.out.println(b);
					}
				}
			}
		}
	}
}