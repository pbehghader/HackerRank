import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;


public class Algorithms_Sorting_Closest_Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		Vector<Integer> l = new Vector<Integer>();
		while (--N >= 0)
			l.add(sc.nextInt());
		Collections.sort(l);
		int min = Integer.MAX_VALUE;
		Vector<Integer> indexes=new Vector<Integer>();

		for (int i = 0; i < l.size() - 1; i++) {
			int diff = -l.elementAt(i) + l.elementAt(i + 1);
			if (diff < min) {
				indexes.clear();
				indexes.add(i);
				min = diff;
			}
			else if (diff==min)
				indexes.add(i);
		}
		for (Integer i : indexes)
			System.out.print(l.elementAt(i) + " " + l.elementAt(i + 1)+" ");

	}

}
