import java.math.BigInteger;
import java.util.Scanner;

public class Algorithms_Dynamic_Programming_Sam_and_sub_strings {
	public static void main (String[] args){
		
		Scanner sc = new Scanner (System.in);

		String seq=sc.nextLine();
		
		long total;
		long head;
		
		total=head = Long.parseLong(seq.substring(0,1));
		
		for (int i=1;i<seq.length();i++){
			
			int num = Integer.parseInt(seq.substring(i,i+1));
			head = (head*10)%1000000007;
			head += (num*(i+1))%1000000007
					;
			total+=head;
			total=total%1000000007;
		}

		System.out.println(total);
		sc.close();
	}
}
