import java.util.Scanner;

public class Algorithms_Sorting_Quicksort_1_Partition {
	public static void main (String [] args){
		Scanner in = new Scanner (System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i=0; i<N; i++)
			arr[i]=in.nextInt();
		
		devide(0,0,N-1,arr);
		for (int i=0; i<N; i++)
			System.out.print(arr[i]+" ");
		
	}

	private static void devide(int pi, int start, int end, int[] arr) {
		int pv = arr[pi];
		int i=start;
		int j=end;
		if (j<=i)
			return;
		arr[pi]=arr[end];
		j--;
		while (i<j){
			while (arr[i]<pv&&i<j)
				i++;
			while (arr[j]>=pv&&i<j)
				j--;
			if (i<j){
				int tmp = arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
				i++;
				j--;
			}
		}
		if(arr[i]>=pv){
			arr[end]=arr[i];
			arr[i]=pv;
		}
		else{
			arr[end]=arr[j+1];
			arr[j+1]=pv;
		}
	}
}
