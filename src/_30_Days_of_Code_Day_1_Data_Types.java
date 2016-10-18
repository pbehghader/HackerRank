import java.text.DecimalFormat;
import java.util.Scanner;

public class _30_Days_of_Code_Day_1_Data_Types {
	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		
		Scanner scan = new Scanner (System.in);
		
		int vi = Integer.parseInt(scan.nextLine());
		double vd = Double.parseDouble(scan.nextLine());
		String str = scan.nextLine();
		
		System.out.println(i+vi);
		
		DecimalFormat df = new DecimalFormat("#.0");
		System.out.println(df.format(d+vd));
		System.out.println(s+str);
	}
}
