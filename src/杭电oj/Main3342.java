package º¼µçoj;

import java.util.*;

public class Main3342 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			if(n==0&&m==0) {
				return;
			}
			int graph[][]=new int[n][n];
			int degree[]=new int[n];
			for(int i=0;i<m;i++) {
				int x=sc.nextInt();
				int y=sc.nextInt();
				if(graph[x][y]==0) {
					graph[x][y]=1;
					degree[y]++;
				}
			}
			Queue<Integer> q=new LinkedList<>();
			Queue<Integer> s=new LinkedList<>();
			for(int i=0;i<n;i++) {
				if(degree[i]==0) {
					q.add(i);
				}
			}
			while(!q.isEmpty()) {
				int a=q.poll();
				s.add(a);
				for(int i=0;i<n;i++) {
					if(graph[a][i]==1) {
						degree[i]--;
						if(degree[i]==0) {
							q.add(i);
						}
					}
				}
			}
			if(s.size()==n) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
