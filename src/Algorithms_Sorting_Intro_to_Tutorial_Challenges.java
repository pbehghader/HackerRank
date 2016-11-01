import java.util.Scanner;

public class Algorithms_Sorting_Intro_to_Tutorial_Challenges {
	
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		int V = Integer.parseInt(sc.nextLine());
		int n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n];
		for (int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int begin=0;
		int end=n-1;
		int middle=0;
		while (begin<=end){
			middle = (begin+end)/2;
			if (arr[middle]==V)
				break;
			if (arr[middle]<V)
				begin=middle+1;
			else 
				end=middle-1;
		}
		System.out.println(middle);
	}

}
