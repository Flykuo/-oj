package 杭电oj;

import java.util.*;

public class Main1285 {
	public static int graph[][];
	public static int degree[];
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			graph=new int[n][n];//邻接矩阵
			degree=new int[n];//结点的度数
			for(int i=0;i<m;i++) {
				int a=sc.nextInt()-1;
				int b=sc.nextInt()-1;
				if(graph[a][b]==0) {
					graph[a][b]=1;
					degree[b]++;
				}
			}
			PriorityQueue<Integer> q=new PriorityQueue<>();//优先队列
			//将开始度为0的节点加入优先队列
			for(int i=0;i<n;i++) {
				if(degree[i]==0) {
					q.add(i);
				}
			}
			int index=-1;
			while(!q.isEmpty()) {
				int a=q.poll()+1;
				if(index==-1) {
					System.out.print(a);
					index=1;
				}else {
					System.out.print(" "+a);
				}
				for(int i=0;i<n;i++) {
					if(graph[a-1][i]==1) {
						degree[i]--;
						if(degree[i]==0) {//度数为0就加入优先队列
							q.add(i);
						}
					}
				}
			}
			System.out.println();
		}
	}
}
