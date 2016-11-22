import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Algorithms_Sorting_Quicksort_2_Sorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
		sort(arr, 0, N - 1);

	}

	private static void sort(int[] arr, int start, int end) {
		if (start >= end)
			return;
		int p = arr[start];
		Queue<Integer> l = new LinkedList<Integer>();
		Queue<Integer> g = new LinkedList<Integer>();
		for (int i = start + 1; i <= end; i++) {
			if (arr[i] < p)
				l.add(arr[i]);
			else
				g.add(arr[i]);
		}
		int k=start; 
		while (l.size()>0)
			arr[k++]=l.poll();
		int ip=k;
		arr[k++]=p;
		while(g.size()>0)
			arr[k++]=g.poll();
		
		sort(arr,start,ip-1);
		sort(arr,ip+1,end);
		for (int i=start;i<=end;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}
