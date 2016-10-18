import java.util.Scanner;

public class Algorithms_Greedy_Reverse_Shuffle_Merge {

	private static int MAX = 256;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
//		StringBuilder tmp = new StringBuilder ();
//		for (int i = 0 ; i< 5000;i++)
//			tmp.append("ab");
//		Straing input = tmp.toString();
		int[] total = new int[256];
		int[] skip = new int[256];
		int[] used = new int[256];

		for (int i = 0; i < 256; i++){
			total[i] = 0;
			used[i]=0;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			sb.append(input.charAt(i));
			total[input.charAt(i)]++;
		}

		for (int i = 0; i < 256; i++)
			skip[i] = total[i]/2;

		String reverse = sb.toString();

		StringBuilder result = new StringBuilder();
		char current = (char) MAX;

		int base = 0;
		while (true) {
			char minChar = (char) MAX;
			int minIndex = -1;
			int i;
			for (i = base; i < reverse.length(); i++) {
				char ci = reverse.charAt(i);
				if (used[ci]<total[ci]/2){
					if (ci<minChar){
						minChar=ci;
						minIndex=i;
					}
				}
				if (skip[ci] > 0)
					skip[ci]--;
				else
					break;
			}
//			System.out.println(base +" " + i + " " +minIndex);
			result.append(minChar);
			used[minChar]++;
			if (result.length() >= reverse.length() / 2)
				break;

			for (int j = minIndex; j < i; j++)
				skip[reverse.charAt(j)]++;
			base=minIndex+1;
		}

		// for (int i = 0; i < reverse.length(); i++) {
		// System.out.println(current);
		// // if (result.length()==reverse.length()/2)
		// // break;
		// char ci = reverse.charAt(i);
		// if (current == MAX) {
		// current = ci;
		// continue;
		// }
		//
		// if (ci > current) {
		// if (cCount[ci] > 0)
		// cCount[ci]--;
		// else {
		// result.append(current);
		// result.append(ci);
		// current = (char) MAX;
		// }
		// } else {
		// if (cCount[current] > 0)
		// cCount[current]--;
		// else
		// result.append(current);
		// current = ci;
		// }
		// }
		// if (current!=MAX && cCount[current]==0)
		// result.append(current);

		System.out.println(result.toString());
//		System.out.println(result.length());
	}
}
