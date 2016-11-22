
import java.util.Scanner;

public class Algorithms_Dynami_Programming_Candies {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] kids = new int[n];

		for (int i = 0; i < n; i++) {
			kids[i] = sc.nextInt();
		}

		int[] candy = new int[n];

		candy[0] = 1;
		for (int i = 1; i < n; i++)
			if (kids[i] > kids[i - 1])
				candy[i] = candy[i - 1]+1;
			else
				candy[i] = 1;
		
//		for (int i=0;i<n;i++)
//			System.out.println(kids[i]+ " "+candy[i]);
//		System.out.println();
		long total = candy[n - 1];
		for (int i = n - 1; i > 0; i--) {
			if (kids[i - 1] > kids[i] && candy[i-1]<=candy[i])
				candy[i - 1] = candy[i]+1;
			total += candy[i - 1];
		}
		
//		for (int i=0;i<n;i++)
//			System.out.println(kids[i]+ " "+candy[i]);

		System.out.println(total);
		sc.close();

	}
}
