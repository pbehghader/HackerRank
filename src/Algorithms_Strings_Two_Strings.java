import java.util.Scanner;

public class Algorithms_Strings_Two_Strings {
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-->0){
			String a = sc.nextLine();
			String b = sc.nextLine();
			String ans="NO";
			int [] count = new int['z'-'a'+1];
			for (int i=0;i<a.length();i++)
				count[a.charAt(i)-'a']++;
			for (int i=0; i<b.length();i++)
				if (count[b.charAt(i)-'a']>0){
					ans="YES";
					break;
				}
			System.out.println(ans);
		}
	}
}
