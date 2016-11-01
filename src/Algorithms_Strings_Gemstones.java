import java.util.HashSet;
import java.util.Scanner;

public class Algorithms_Strings_Gemstones {
	public static void main (String[] args){
		int [] array = new int [256];
		for (int j=0;j<256;j++)
			array[j]=0;
		Scanner sc = new Scanner (System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i=0;i<n;i++){
			String in = sc.next();
			HashSet<Character> s = new HashSet<Character>(); 
			for (int j=0;j<in.length();j++)
				s.add(in.charAt(j));
			for (Character c : s)
				array [c]++;
		}
		
		int total=0 ;
		for (int j=0;j<256;j++)
			if (array[j]==n)
				total++;
		
		System.out.println(total);
	}

}
