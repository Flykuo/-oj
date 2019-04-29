package ����oj;

import java.util.*;

public class Main1285 {
	public static int graph[][];
	public static int degree[];
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			graph=new int[n][n];//�ڽӾ���
			degree=new int[n];//���Ķ���
			for(int i=0;i<m;i++) {
				int a=sc.nextInt()-1;
				int b=sc.nextInt()-1;
				if(graph[a][b]==0) {
					graph[a][b]=1;
					degree[b]++;
				}
			}
			PriorityQueue<Integer> q=new PriorityQueue<>();//���ȶ���
			//����ʼ��Ϊ0�Ľڵ�������ȶ���
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
						if(degree[i]==0) {//����Ϊ0�ͼ������ȶ���
							q.add(i);
						}
					}
				}
			}
			System.out.println();
		}
	}
}
