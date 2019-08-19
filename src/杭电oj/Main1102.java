package 杭电oj;

import java.util.Arrays;
import java.util.Scanner;

public class Main1102 {
	static int f[];
	static Edge a[];
	static int find(int x) {
		return f[x]==x?x:(f[x]=find(f[x]));
	}
	static class Edge implements Comparable<Edge>{
		int u,v,w;
		Edge(int u,int v,int w){
			this.u=u;
			this.v=v;
			this.w=w;
		}
		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			if(w==o.w) {return 0;}
			return w-o.w;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
        while (sc.hasNext()) {
			int n=sc.nextInt();
			int m=n*(n-1)/2;
			a=new Edge[m];
			int cnt=0;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					int w=sc.nextInt();
					if(i<j) {
						a[cnt++]=new Edge(i+1,j+1,w);
					}
				}
			}
			f=new int[n+1];
			for(int i=1;i<=n;i++) {
				f[i]=i;
			}
			int tt=sc.nextInt(),x,y;
			for(int i=0;i<tt;i++) {
				x=find(sc.nextInt());
                y=find(sc.nextInt());
                if(x!=y){
                    f[x]=y;
                }
			}
			Arrays.sort(a);
			int ans=0;
			for (int i = 0; i < m; i++) {
                x = find(a[i].u);
                y = find(a[i].v);
                if (x != y) {
                    ans += a[i].w ;
                    f[x] = y;
                }
            }
            System.out.println(ans);
		}
	}
}
