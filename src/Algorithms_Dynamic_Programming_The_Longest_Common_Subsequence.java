import java.util.Scanner;
import java.util.Stack;

public class Algorithms_Dynamic_Programming_The_Longest_Common_Subsequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		int m = sc.nextInt();
		int[] b = new int[m];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (int j = 0; j < m; j++)
			b[j] = sc.nextInt();

		int[][] lcs = new int[n][m];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				if (a[i] == b[j]) {
					int max = 0;
					for (int ii = 0; ii < i; ii++)
						for (int jj = 0; jj < j; jj++)
							if (max < lcs[ii][jj])
								max = lcs[ii][jj];
					lcs[i][j] = max + 1;
				}

		int superMax = 101;
		Stack<Integer> s = new Stack<Integer>();
		int _i = n;
		int _j = m;
		while (superMax > 1) {
			int max = 0;
			int num = -1;
			int ti = 0;
			int tj = 0;
			for (int i = 0; i < _i; i++)
				for (int j = 0; j < _j; j++)
					if (a[i] == b[j] && max <= lcs[i][j] && lcs[i][j] < superMax) {
						max = lcs[i][j];
						num = a[i];
						ti = i;
						tj = j;
					}
			_i = ti;
			_j = tj;
			superMax = max;

			if (num != -1)
				s.push(num);

		}
		while (!s.isEmpty())
			System.out.print(s.pop() + " ");
		System.out.println();

		sc.close();
	}
}
