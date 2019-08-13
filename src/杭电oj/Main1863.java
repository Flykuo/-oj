package 杭电oj;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main1863 {
	static class Edge implements Comparable<Edge>{
		int a,b,w;
		public Edge(int a,int b,int w) {
			this.a=a;
			this.b=b;
			this.w=w;
		}
		@Override
		public int compareTo(Edge o) {
			if(w==o.w) {return 0;}
			return w-o.w;
		}
	}
	static int f[];
	static int find(int x) {
		return f[x]==x?x:(f[x]=find(f[x]));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			if(n==0) {
				return;
			}
			f=new int[m+1];
			for(int i=1;i<=m;i++) {
				f[i]=i;
			}
			PriorityQueue<Edge> q=new PriorityQueue<>();
			for(int i=0;i<n;i++) {
				q.add(new Edge(sc.nextInt(),sc.nextInt(),sc.nextInt()));
			}
			int cnt=-1;
			long ans=0;
			while(!q.isEmpty()) {
				Edge a=q.poll();
				int x=find(a.a);
				int y=find(a.b);
				if(x!=y) {
					ans+=a.w;
					f[x]=y;
				}
			}
			for(int i=1;i<=m;i++) {
				if(f[i]==i) {
					cnt++;
				}
			}
			if(cnt!=0) {
				System.out.println("?");
			}else{
				System.out.println(ans);
			}
		}
		sc.close();
	}
}
