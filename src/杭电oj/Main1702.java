package 杭电oj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
//简单的出入队 以及出入栈
public class Main1702 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {
			int T=sc.nextInt();
			while(T-->0) {
				int n=sc.nextInt();
				String str=sc.next();
				if(str.equals("FIFO")) {
					Queue<Integer> q=new LinkedList<Integer>();
					for(int i=0;i<n;i++) {
						String s=sc.next();
						if(s.equals("IN")) {
							q.add(sc.nextInt());
						}else {
							if(!q.isEmpty()) {
								System.out.println(q.poll());
							}else {
								System.out.println("None");
							}
						}
					}
				}else {
					Stack<Integer> st=new Stack<Integer>();
					for(int i=0;i<n;i++) {
						String s=sc.next();
						if(s.equals("IN")) {
							st.add(sc.nextInt());
						}else {
							if(!st.isEmpty()) {
								System.out.println(st.pop());
							}else {
								System.out.println("None");
							}
						}
					}
				}
			}
		}
	}
}