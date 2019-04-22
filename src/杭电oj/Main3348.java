package 杭电oj;

import java.util.Scanner;

public class Main3348 {

	public static int arr[];
	public static int flykuo(int n) {
		int sum1=0;
		int sum2=0;
		int sum3=0;
		int sum4=0;
		int sum5=0;
		int l=arr.length-1;
			while(n>=100&&arr[l]-sum1>0) {
					n-=100;
					sum1++;
			}
			while(n>=50&&arr[l-1]>sum2) {
					n-=50;
					sum2++;
			}
			while(n>=10&&arr[l-2]>sum3) {
					n-=10;
					sum3++;
			}
			while(n>=5&&arr[l-3]>sum4) {
					n-=5;
					sum4++;
			}
			while(n>=1&&arr[l-4]>sum5) {
					n-=1;
					sum5++;
			}
			if(n==0) {
				return sum1+sum2+sum3+sum4+sum5;
			}else {
				return -1;
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {
			int T=sc.nextInt();
			while(T-->0) {
				int n=sc.nextInt();
				arr=new int [5];
				int sum=0;//总票数
				int sum1=0;//总金额
				for(int i=0;i<5;i++) {
					arr[i]=sc.nextInt();
					sum+=arr[i];
					if(i==0) {
						sum1+=arr[i];
					}else if(i==1) {
						sum1+=5*arr[i];
					}else if(i==2) {
						sum1+=10*arr[i];
					}else if(i==3) {
						sum1+=50*arr[i];
					}else {
						sum1+=100*arr[i];
					}
				}
				System.out.print(flykuo(n)+" ");
				n=sum1-n;
				System.out.println(flykuo(n)==-1?-1:sum-flykuo(n));
			}
		}
	}

}
