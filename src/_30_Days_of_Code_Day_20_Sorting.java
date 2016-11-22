import java.util.Scanner;

public class _30_Days_of_Code_Day_20_Sorting {

	public static int sort(int[] a) {
		int n = a.length;
		int total = 0;
		for (int i = 0; i < n; i++) {
			// Track number of elements swapped during a single array traversal
			int numberOfSwaps = 0;

			for (int j = 0; j < n - 1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (a[j] > a[j + 1]) {
					// swap(a[j], a[j + 1]);
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
					numberOfSwaps++;
				}
			}

			// If no elements were swapped during a traversal, array is sorted
			total += numberOfSwaps;
			if (numberOfSwaps == 0) {
				break;
			}
		}
		return total;
	}
	
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i=0;i<N;i++)
			arr[i]=sc.nextInt();
		int total=sort(arr);
		System.out.println("Array is sorted in "+total+" swaps.");
		System.out.println("First Element: "+arr[0]);
		System.out.println("Last Element: "+arr[N-1]);
		
	}
}
