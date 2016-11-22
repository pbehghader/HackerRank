import java.util.Scanner;

public class Algorithms_Dynamic_Programming_The_Coin_Change_Problem {
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] c = new int [m];
		for (int i=0;i<m;i++)
			c[i]=sc.nextInt();
		long [][] arr = new long[m][n+1];
		for (int j=0;j<=n;j++)
			if (j%c[0]==0)
				arr[0][j]=1;
		for (int i=0;i<m;i++)
			arr[i][0]=1;
		for (int i=1;i<m;i++)
			for (int j=1;j<=n;j++){
				arr[i][j]=arr[i-1][j];
				if (j-c[i]>=0)
					arr[i][j]+=arr[i][j-c[i]];
			}
		System.out.println(arr[m-1][n]);
	}
}
