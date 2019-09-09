package 杭电oj;

import java.util.*;

public class Main1710 {
	
	static int front[],middle[],back[],num;
	
	static int find(int temp,int l,int r) {
		for(int i=l;i<r;i++) {
			if(middle[i]==temp) {
				return i;
			}
		}
		return 0;
	}
	
	static void creat(int fl,int fr,int ml,int mr) {
		if(ml==mr) {
			return;
		}
		int root=find(front[fl],ml,mr);
		int length=root-ml;
		creat(fl+1, fr+1+length, ml, root);
		creat(fl+1+length,fr,root+1,mr);
		back[num++]=middle[root];
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			front=new int[n];
			middle=new int[n];
			back=new int[n];
			for(int i=0;i<n;i++) {
				front[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				middle[i]=sc.nextInt();
			}
			num=0;
			creat(0, n, 0, n);
			for(int i=0;i<n;i++) {
				if(i!=0) {
					System.out.print(" ");
				}
				System.out.print(back[i]);
			}
			System.out.println();
		}
	}
}
