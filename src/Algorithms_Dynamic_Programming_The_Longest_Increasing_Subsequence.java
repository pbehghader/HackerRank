import java.util.Scanner;

public class Algorithms_Dynamic_Programming_The_Longest_Increasing_Subsequence {
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] arr = new int [n];
		for (int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int[] tail = new int[n];
		int len = 1;
		tail[len-1]=arr[0];
		for (int i=1;i<n;i++){
			if (arr[i]<tail[0])
				tail[0]=arr[i];
			else if (arr[i]>tail[len-1])
				tail[len++]=arr[i];
			else {
				int index = findCeil(tail,len,arr[i]);
				tail [index]=arr[i];
			}
		}
		
		System.out.println(len);
	}

	private static int findCeil(int[] tail, int len, int v) {
		int l=0;
		int r=len-1;
		while (l<r){
			int m = l+(r-l)/2;
			if (tail[m]<v)
				l=m+1;
			else
				r=m;
		}
		return l;
	}
}
