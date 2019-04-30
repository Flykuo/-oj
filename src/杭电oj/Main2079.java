package º¼µçoj;
import java.util.*;

public class Main2079 {
	public static void dfs(int start,int sum) {
		if(sum==n) {
			count++;
			return;
		}
		if(start>=k||sum>n) {
			return;
		}
		for(int i=0;i<=b[start];i++) {
			dfs(start+1,sum+i*a[start]);
		}
	}
	public static int a[],b[],count,n,k;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int T=sc.nextInt();
			while(T-->0) {
				n=sc.nextInt();
				k=sc.nextInt();
				a=new int[k];
				b=new int[k];
				for(int i=0;i<k;i++) {
					a[i]=sc.nextInt();
					b[i]=sc.nextInt();
				}
				count=0;
				dfs(0,0);
				System.out.println(count);
			}
		}
	}
}
