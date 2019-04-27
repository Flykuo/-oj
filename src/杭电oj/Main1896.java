package º¼µçoj;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main1896 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PriorityQueue<flykuo> q=new PriorityQueue<flykuo>();
		while (sc.hasNext()) {
			int T=sc.nextInt();
			while(T-->0) {
				int n=sc.nextInt();
				for(int i=0;i<n;i++) {
					q.add(new flykuo(sc.nextInt(),sc.nextInt()));
				}
				int index=1;
				int flag=0;
				while(!q.isEmpty()) {
					if(index%2!=0) {
						index++;
						flykuo a=q.poll();
						q.add(new flykuo(a.pos+a.dis,a.dis));
					}else {
						flag=q.peek().pos;
						q.poll();
						index++;
					}
				}
				System.out.println(flag);
			}
		}
	} 
	static class flykuo implements Comparable<flykuo>{
		int pos,dis;
		flykuo(int pos,int dis){
			this.pos=pos;
			this.dis=dis;
		}
		@Override
		public int compareTo(flykuo o) {
			// TODO Auto-generated method stub
			if(pos==o.pos) {
				return dis>o.dis?1:-1;
			}
			return pos>o.pos?1:-1;
		}
	}
}
