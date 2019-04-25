package º¼µçoj;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1233 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			if(n==0) {
				return;
			}
			int sum=n*(n-1)/2;
			int map[][]=new int[n][n];
			int path[]=new int[n];
			for(int i=0;i<n;i++) {
				Arrays.fill(map[i], 0x3f3f3f3f);
			}
			for(int i=0;i<sum;i++) {
				int x=sc.nextInt()-1;
				int y=sc.nextInt()-1;
				int v=sc.nextInt();
				if(map[x][y]>v||map[y][x]>v) {
					map[x][y]=map[y][x]=v;
				}
			}
			Queue<Integer> q=new LinkedList<Integer>();
			q.add(0);
			path[0]=1;
			int sum1=0;
			while(q.size()!=n) {
				int min=0x3f3f3f3f;
				int index=-1;
				for(Integer a:q) {
					for(int i=0;i<n;i++) {
						if(map[a][i]!=0x3f3f3f3f&&path[i]==0&&map[a][i]<min) {
							min=map[a][i];
							index=i;
						}
					}
				}
				q.add(index);
				path[index]=1;
				sum1+=min;
			}
			System.out.println(sum1);
		}
	}
}
