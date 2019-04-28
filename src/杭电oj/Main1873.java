package º¼µçoj;

import java.util.*;

public class Main1873 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {
			int T=sc.nextInt();
			PriorityQueue<flykuo> q1=new PriorityQueue<flykuo>();
			PriorityQueue<flykuo> q2=new PriorityQueue<flykuo>();
			PriorityQueue<flykuo> q3=new PriorityQueue<flykuo>();
			int a=1,b=1,c=1,d=1;
			while(T-->0){
				String str=sc.next();
				if(str.equals("IN")) {
					int aa=sc.nextInt();
					if(aa==1) {
						q1.add(new flykuo(a++,sc.nextInt(),d++));
					}else if(aa==2) {
						q2.add(new flykuo(b++,sc.nextInt(),d++));
					}else {
						q3.add(new flykuo(c++,sc.nextInt(),d++));
					}
				}else {
					int bb=sc.nextInt();
					if(bb==1) {
						if(!q1.isEmpty()) {
							System.out.println(q1.poll().index);
						}else {
							System.out.println("EMPTY");
						}
					}else if(bb==2) {
						if(!q2.isEmpty()) {
							System.out.println(q2.poll().index);
						}else {
							System.out.println("EMPTY");
						}
					}else {
						if(!q3.isEmpty()) {
							System.out.println(q3.poll().index);
						}else {
							System.out.println("EMPTY");
						}
					}
				}
			}
			
		}
	}
	static class flykuo implements Comparable<flykuo>{
		int p,f,index;
		flykuo(int p,int f,int index){
			this.f=f;
			this.p=p;
			this.index=index;
		}
		@Override
		public int compareTo(flykuo o) {
			// TODO Auto-generated method stub
			if(f==o.f) {
				return p>o.p?1:-1;
			}
			return f>o.f?-1:1;
		}
	}
}
