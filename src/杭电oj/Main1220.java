package ����oj;

import java.util.Scanner;

/*����һ���߳�n�������壬�и��n*n*n����λ�����С�����壬�����й���������<=2��С������Ķ�����  ���������Ŀ�����У�0,1,2,4.
�������ܵĶ����������ĸ�������Ķ����Ϳ����ˡ�  �ܵĶ�����n^3*(n^3-1)/2(һ����n^3��С���飬����ѡ��2��)
������Ϊ4�Ķ�����һ����n-1�ԣ�n��С���飬���ڵ�����Ϊһ�Է���Ҫ�󣩣�һ����Ĺ��� n^2�У�  ��������棬ǰ������������ͬ��
ͬ��ɵã�������Ϊ��3*n^2(n-1)
���Խ��Ϊ��n^3 * (n^3-1) / 2 - 3*n^2(n-1) */

public class Main1220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			System.out.println(n*n*n*(n*n*n-1)/2-3*n*n*(n-1));
		}
	}
}
