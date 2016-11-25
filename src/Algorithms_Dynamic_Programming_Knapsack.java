import java.util.Scanner;

public class Algorithms_Dynamic_Programming_Knapsack {
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int k = sc.nextInt();

			int[] nums = new int[n+1];
			for (int i = 1; i <= n; i++)
				nums[i] = sc.nextInt();
			
			int [][] max= new int [n+1][k+1];
			
			for (int i=1;i<=n;i++)
				for (int j=1;j<=k;j++){
					if (j>=nums[i])
						max[i][j]=nums[i]+max[i][j-nums[i]];
					if (max[i-1][j]>max[i][j])
						max[i][j]=max[i-1][j];
				}
			
			System.out.println(max[n][k]);
			
		}
		sc.close();
	}
	
}
