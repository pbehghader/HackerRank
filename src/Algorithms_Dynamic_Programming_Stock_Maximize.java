import java.util.Scanner;

public class Algorithms_Dynamic_Programming_Stock_Maximize {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			int max = arr[n - 1];
			long total = 0;
			for (int i = n - 2; i >= 0; i--)
				if (arr[i] > max)
					max = arr[i];
				else
					total += max - arr[i];

			System.out.println(total);

		}

	}
}
