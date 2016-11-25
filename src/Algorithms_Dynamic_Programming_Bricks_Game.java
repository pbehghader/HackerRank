import java.util.Scanner;

public class Algorithms_Dynamic_Programming_Bricks_Game {
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t-->0){
			int n = sc.nextInt();
			int [] arr = new int [n];
			long[] sum = new long[n];
			for (int i=0;i<n;i++)
				arr[n-1-i]=sc.nextInt();
			
			sum[0]=arr[0];
			for (int i=1;i<n;i++)
				sum[i]=arr[i]+sum[i-1];
			long[] max = new long[n];
			max[0]=arr[0];
			max[1]=arr[0]+arr[1];
			max[2]=arr[0]+arr[1]+arr[2];
			
			for (int i=3;i<n;i++)
				max[i]=Math.max(Math.max(sum[i]-max[i-1], sum[i]-max[i-2]), sum[i]-max[i-3]);
		
			System.out.println(max[n-1]);
		}
	}
}
