import java.util.Scanner;

public class Algorithms_Strings_The_LoveLetter_Mystery {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		String line = in.nextLine();
		int n = Integer.parseInt(line);
		while (n-->0){
			line = in.nextLine();
			int i = 0;
			int j = line.length()-1;
			int td = 0 ;
			while (i<j){
				
				td += Math.abs(line.charAt(i)-line.charAt(j));
				
				i++;
				j--;
			}
			System.out.println(td);
		}
	}
}
