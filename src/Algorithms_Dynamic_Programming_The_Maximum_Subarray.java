import java.util.Scanner;

public class Algorithms_Dynamic_Programming_The_Maximum_Subarray {
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t-->0){
			int n = sc.nextInt();
			long [] sum = new long [n];
			long any=0;
			long singleMax=Integer.MIN_VALUE;
			for (int i=0;i<n;i++){
				int v = sc.nextInt();
				any+= (v>0)?v:0;
				if (i==0){
					sum[i]=v ;
					singleMax=v;
				}
				else{
					sum[i]=v+sum[i-1];
					if (v>singleMax)
						singleMax=v;
				}
			}
			if (singleMax<0)
				any=singleMax;
			long[] min = new long[n];
			min[0]=0;
			for (int i=1;i<n;i++){
				if (sum[i-1]<min[i-1])
					min[i]=sum[i-1];
				else
					min[i]=min[i-1];
			}
			
			long [] max = new long[n];
			max[n-1]=sum[n-1];
			for (int i=n-2;i>=0;i--){
				if (sum[i]>max[i+1])
					max[i]=sum[i];
				else
					max[i]=max[i+1];
			}
			long cont=0;
			for (int i=0;i<n;i++){
				if (cont<max[i]-min[i]){
					cont=max[i]-min[i];
//					System.out.println(max[i]+ "-"+min[i]);
				}
					
			}
			if (singleMax<0)
				cont=singleMax;
			System.out.println(cont +" "+any);
		}
	}
}
