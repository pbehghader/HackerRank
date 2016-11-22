import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;
import java.util.function.Consumer;

public class Algorithms_Graph_Theory_Even_Tree {
	static Vector<HashSet<Integer>> adjs;
	static int n;
	static int m;
	static int total = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		adjs = new Vector<HashSet<Integer>>();
		for (int i = 0; i < n + 1; i++)
			adjs.add(new HashSet<Integer>());

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			adjs.get(a).add(b);
			adjs.get(b).add(a);
		}

		
		HashSet<Integer> done = new HashSet<Integer>();
		while (done.size() != n) {
			for (int i = 1; i < n + 1; i++) {
				if (done.contains(i))
					continue;
				if (!remove(i)) 
					done.add(i);
			}
		}
		System.out.println(total);
		;

	}

	private static boolean remove(int node) {
		// TODO Auto-generated method stub
		boolean ret = false;
		Object[] arr = adjs.get(node).toArray();
		for (int i=0;i<arr.length;i++){
			HashSet<Integer> mark = new HashSet<Integer>();
			mark.add(node);
			int child = (int) arr[i];
			int s = size(child,mark);
			if (s%2==0){
				total++;
				ret = true;
				adjs.get(node).remove(child);
				adjs.get(child).remove(node);
			}
		}
		
		return false;
	}

	private static int size(int node, HashSet<Integer> mark) {
		int ret = 1;
		mark.add(node);
		Object[] arr = adjs.get(node).toArray();
		
		for (int i=0;i<arr.length;i++){
			int child = (int) arr[i];
			if (!mark.contains(child))
				ret+=size(child,mark);
		}
		return ret;
	}
}
