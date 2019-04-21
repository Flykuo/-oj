package º¼µçoj;

import java.util.Arrays;
import java.util.Scanner;

public class Main1789 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner (System.in);
        while(sc.hasNext()){
            int T=sc.nextInt();
            while(T-->0){
                int n=sc.nextInt();
                int arr[]=new int[n];
                int max=-1;
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                    if(max<arr[i]){
                        max=arr[i];
                    }
                }
                flykuo a[]=new flykuo[n];
                for(int i=0;i<n;i++){
                    a[i]=new flykuo(arr[i],sc.nextInt());
                }
                Arrays.sort(a);
                boolean b[]=new boolean[max+1];
                Arrays.fill(b, true);
                int sum=0;
                for(int i=0;i<n;i++){
                    if(b[a[i].a]){
                        b[a[i].a]=false;
                    }else{
                        int index=-1;
                        for(int j=a[i].a-1;j>=1;j--){
                            if(b[j]){
                                b[j]=false;
                                index=1;
                                break;
                            }
                        }
                        if(index==-1){
                            sum+=a[i].b;
                        }
                    }
                }
                System.out.println(sum);
            }
        }
    }
    static class flykuo implements Comparable<flykuo>{
    	int a,b;
    	flykuo(int a,int b){
    		this.a=a;
    		this.b=b;
    	}
    	@Override
    	public int compareTo(flykuo o) {
    		// TODO Auto-generated method stub
    		if(b==o.b){
    			return (a>o.a)?-1:1;
    		}else{
    			return (b>o.b)?-1:1;
    		}
    		
    	}
    }
}