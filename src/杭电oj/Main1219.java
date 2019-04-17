package º¼µçoj;

import java.util.Scanner;

public class Main1219 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {
			String str=sc.nextLine();
			int arr[]=new int[26];
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
					arr[str.charAt(i)-97]++;
				}
			}
			for(int i=0;i<26;i++) {
				System.out.println((char)(i+97)+":"+arr[i]);
			}
			System.out.println();
		}
	}

}
