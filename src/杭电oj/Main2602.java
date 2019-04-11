package º¼µçoj;
import java.util.Scanner;

public class Main2602 {
     public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                int T=sc.nextInt();
                while(T-->0) {
                    int n=sc.nextInt();
                    int v=sc.nextInt();
                    int a[]=new int[n+1];
                    int b[]=new int[n+1];
                    int dp[]=new int[v+1];
                    for(int i=1;i<a.length;i++) {
                        a[i]=sc.nextInt();
                    }
                    for(int i=1;i<b.length;i++) {
                        b[i]=sc.nextInt();
                    }
                    for(int i=1;i<b.length;i++) {
                        for(int j=v;j>=b[i];j--) {
                            dp[j]=Math.max(dp[j], dp[j-b[i]]+a[i]);
                        }
                    }
                    System.out.println(dp[v]);
                }
            }
            sc.close();
      }
}