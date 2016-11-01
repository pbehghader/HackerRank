import java.util.Scanner;

public class ـ30ـDaysـofـCodeـDayـ6LetsـReview {
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.nextLine());
		for (int i=0;i<t;i++){
			String line = sc.nextLine();
			StringBuilder o = new StringBuilder();
			StringBuilder e = new StringBuilder();
			
			for (int j=0;j<line.length();j++){
				if (j%2==1)
					o.append(line.charAt(j));
				else
					e.append(line.charAt(j));
			}
			
			System.out.println(e.toString()+ " "+o.toString());
			
		}
	}
}
