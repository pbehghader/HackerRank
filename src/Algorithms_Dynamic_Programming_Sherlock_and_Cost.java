import java.util.Scanner;

public class Algorithms_Dynamic_Programming_Sherlock_and_Cost {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long o = 0;
			long m = 0;
			int prev = sc.nextInt();
			for (int i = 1; i < n; i++) {
				int curr = sc.nextInt();
				long to = o;
				long tm = m;
				o = Math.max(to, tm + prev - 1);
				m = Math.max(to + curr - 1, tm + Math.abs(curr - prev));
				prev=curr;
			}
			System.out.println(Math.max(o, m));
		}
	}
}
