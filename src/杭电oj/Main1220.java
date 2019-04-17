package 杭电oj;

import java.util.Scanner;

/*给你一个边长n的正方体，切割成n*n*n个单位体积的小正方体，求所有公共顶点数<=2的小正方体的对数。  公共点的数目可能有：0,1,2,4.
我们用总的对数减掉有四个公共点的对数就可以了。  总的对数：n^3*(n^3-1)/2(一共有n^3块小方块，从中选出2块)
公共点为4的对数：一列有n-1对（n个小方块，相邻的两个为一对符合要求），一个面的共有 n^2列，  底面和左面，前面三个方向相同，
同理可得，故总数为：3*n^2(n-1)
所以结果为：n^3 * (n^3-1) / 2 - 3*n^2(n-1) */

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
