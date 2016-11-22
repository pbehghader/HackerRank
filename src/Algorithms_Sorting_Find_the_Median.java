import java.util.Random;
import java.util.Scanner;

public class Algorithms_Sorting_Find_the_Median {
//	public static int n =7;
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Random random = new Random();
		int [] arr= new int[n];
		for (int i=0;i<n;i++){
			arr[i]=sc.nextInt();
//			arr[i]=random.nextInt(1000);
		}
		int m = partition (arr,0,arr.length-1,(arr.length-1)/2);
		System.out.println(m);
	}

	private static int partition(int[] arr, int begin, int end, int k) { 
		
		int pv = arr[end];
		if (begin>=end)
			return pv;
		
		int i=begin;
		int j=end-1;
		while (i<=j){
			if (arr[i]>=pv){
				int tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
				j--;
			}else
				i++;
		}
		arr[end]=arr[i];
		arr[i]=pv;
//		System.out.println(begin + " " +end+" "+i+" "+k+" " +pv);
//		for (int c=0;c<n;c++)
//			System.out.print(arr[c]+" " );
//		System.out.println();
		if (i==k)
			return arr[i];
		else if (i<k)
			return partition(arr,i+1,end,k);
		else
			return partition(arr,begin,i-1,k);
	}

}
