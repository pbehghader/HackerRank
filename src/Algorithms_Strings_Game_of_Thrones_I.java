import java.util.Scanner;

public class Algorithms_Strings_Game_of_Thrones_I {
	public static void main (String[] args){
		int [] count = new int [256];
		for (int i=0;i<256;i++)
			count[i]=0;
		Scanner sc = new Scanner (System.in);
		String input = sc.next();
		
		for (int i =0 ; i<input.length();i++)
			count[input.charAt(i)]++;
		String ans = "YES";
		
		int oddCount =0;
		for (int i=0;i<256;i++)
			if (count[i]%2==1)
				oddCount ++;
		if (oddCount>1)
			ans="NO";
			
		System.out.println(ans);
		sc.close();
	}
}
