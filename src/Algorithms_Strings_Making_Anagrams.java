import java.util.Scanner;

public class Algorithms_Strings_Making_Anagrams {
	public static void main (String [] args){
		Scanner in = new Scanner (System.in);
		String a = in.next();
		String b = in.next();
		
		int [] array = new int [256];
		
		int total = 0;
		for (int i=0;i<a.length();i++)
			array[a.charAt(i)]++;
		for (int i=0;i<b.length();i++)
			array[b.charAt(i)]--;
		for (int i =0;i<256;i++)
			total += Math.abs(array[i]);
		
		System.out.println(total);
		
	}
}
