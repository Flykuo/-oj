package º¼µçoj;

import java.util.Arrays;
import java.util.Scanner;

public class Main2000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {
			String str=sc.next();
			char a[]=str.toCharArray();
			Arrays.sort(a);
			for(int i=0;i<a.length;i++) {
				if(i==a.length-1) {
					System.out.println(a[i]);
				}else {
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
