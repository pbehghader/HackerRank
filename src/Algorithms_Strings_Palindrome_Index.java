import java.util.Scanner;

public class Algorithms_Strings_Palindrome_Index {
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-->0){
			String line = sc.nextLine();
			int index = -1 ;
			int i = 0;
			int j = line.length()-1;
			while (i<j){
				if (line.charAt(i)==line.charAt(j)){
					i++;
					j--;
				}
				else
					break;
			}
			if (i>=j){
				System.out.println(index);
				continue;
			}
			int l=i;
			int r=j;
			
			if (line.charAt(i+1)==line.charAt(j)){
				index=i++;
				while (i<j){
					if (line.charAt(i)==line.charAt(j)){
						i++;
						j--;
					}
					else 
						break;
				}
				if (i>=j){
					System.out.println(index);
					continue;
				}	
			}
			i=l;
			j=r;
			
			if (line.charAt(i)==line.charAt(j-1)){
				index=j--;
				while (i<j){
					if (line.charAt(i)==line.charAt(j)){
						i++;
						j--;
					}
					else 
						break;
				}
				if (i>=j){
					System.out.println(index);
					continue;
				}	
			}
			System.out.println(-1);
		}
	}

}
