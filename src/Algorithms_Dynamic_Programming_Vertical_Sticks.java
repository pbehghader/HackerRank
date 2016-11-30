
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Algorithms_Dynamic_Programming_Vertical_Sticks {
	static double[][] f = new double[51][51];

	public static double f(int i, int k) {
		if (k > i)
			return 0;
		if (k < 1)
			return 1;
		return f[i][i - k + 1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		f[1][1] = 1;
		for (int i = 2; i <= 50; i++) {
			f[i][i] = i;
			f[i][1] = i * f[i - 1][1];
		}
		for (int i = 2; i <= 50; i++)
			for (int j = 1; j < i; j++)
				f[i][j] = i * f[i - 1][j];

		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			List<Integer> l = new LinkedList<Integer>();
			for (int i = 0; i < n; i++)
				l.add(sc.nextInt());

			Collections.sort(l);

			double e = 0;

			for (int i = 0; i < n; i++) {
				int smaller = 0;
				int sv = l.get(0);
				for (int j = 0; j < n; j++) {
					int x = l.get(j);

					if (sv < x) {
						smaller = j;
						sv = x;
					}
					int larger = n - smaller - 1;
					for (int v = i + 1; v > 0; v--) {
						if (v > i) {
							double nom = v * f(smaller, v - 1);
							double den = f(n - 1, v - 1) * n;
							e += nom / den;

						} else {

							double nom = v * f(smaller, v - 1) * larger;
							double den = f(n - 1, v) * n;
							e += nom / den;

						}

					}
				}
			}
			System.out.println(String.format("%.2f", e));
		}
		sc.close();
	}

}
