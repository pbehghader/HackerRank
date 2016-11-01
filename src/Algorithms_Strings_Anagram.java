import java.util.Scanner;

public class Algorithms_Strings_Anagram {

	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		int T = Integer.parseInt(sc.nextLine());
		for (int t=0;t<T;t++){
			String str = sc.nextLine();
			if (str.length()%2==1){
				System.out.println("-1");
				continue;
			}
			
			int l2 = str.length()/2;
			
			int[]count = new int[256];
			for (int i=0;i<l2;i++){
				count[str.charAt(i)]++;
				count[str.charAt(i+l2)]--;
			}
			
			int total = 0 ;
			for (int i=0;i<256;i++)
				total += count[i]>0?count[i]:0;
				
			System.out.println(total);
		}
	}

}
