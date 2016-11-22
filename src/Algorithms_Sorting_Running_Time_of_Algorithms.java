import java.util.Scanner;

public class Algorithms_Sorting_Running_Time_of_Algorithms {
	public static int [] arr;
	
	public static void main (String [] args){
		Scanner in = new Scanner (System.in);
		int N = in.nextInt();
		arr = new int [N];
		for (int i=0; i<N; i++)
			arr[i]=in.nextInt();
		
		int total =0;
		for (int i=1;i<N;i++)
			total+=insert(i);
		
		System.out.println(total);
		
	}
	
	public static int insert(int i){
		int s = 0 ;
		int value = arr[i];
		int j;
		boolean set=false;
		for (j=i-1;j>=0;j--){
			if (value<arr[j]){
				arr[j+1]=arr[j];
				s++;
			}
			else{
				arr[j+1]=value;
				set=true;
				break ;
			}
		}
		if (!set)
			arr[0]=value;
		return s ;
	}

}
