import java.util.Scanner;

public class Algorithms_Sorting_Quicksort_In_Place {
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i=0;i<N;i++)
			arr[i]=sc.nextInt();
		quicksort (arr,0,N-1);
		
	}

	private static void quicksort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if (start>=end)
			return ;
		int pi = partition(arr,start,end);
		quicksort(arr,start,pi-1);
		quicksort(arr,pi+1,end);
	}

	private static int partition(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int i=start;
		int p=arr[end];
		for (int j=start;j<end;j++){
			if (arr[j]<p){
				int tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
				i++;
			}
		}
		arr[end]=arr[i];
		arr[i]=p;
		for(int x=0;x<arr.length;x++)
			System.out.print(arr[x]+ " ");
		System.out.println();
		return i;
	}
}
