package º¼µçoj;

import java.math.BigInteger;
import java.util.Scanner;

public class Main1720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {
			String a=sc.next();
			String b=sc.next();
			BigInteger aa=new BigInteger(a,16);
			BigInteger bb=new BigInteger(b,16);
			System.out.println(aa.add(bb).toString(10));
		}
	}

}
