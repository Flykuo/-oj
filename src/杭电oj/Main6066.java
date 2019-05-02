package º¼µçoj;

import java.util.Scanner;

public class Main6066 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {
			int t=sc.nextInt();
			int count=0;
			for(int i=0;i<t;i++) {
				int a=sc.nextInt();
				if(a<=35) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
