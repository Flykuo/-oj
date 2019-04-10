package º¼µçoj;

import java.util.Arrays;
import java.util.Scanner;

public class Main5702 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {
			int T=sc.nextInt();
			while(T-->0) {
				int n=sc.nextInt();
				sc.nextLine();
				flykuo arr[]=new flykuo[n];
				for(int i=0;i<n;i++) {
					arr[i]=new flykuo(sc.next(),sc.nextInt());
				}
				Arrays.sort(arr);
				for(int i=0;i<n;i++) {
					if(i==n-1) {
						System.out.println(arr[i].str);
					}else {
						System.out.print(arr[i].str+" ");
					}
				}
			}
		}
	}
}
class flykuo implements Comparable<flykuo>{
	String str;
	int n;
	flykuo(String str,int n){
		this.str=str;
		this.n=n;
	}
	@Override
	public int compareTo(flykuo o) {
		// TODO Auto-generated method stub
		return (n>o.n)?-1:1;
	}
}
