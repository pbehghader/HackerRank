import java.util.Random;
import java.util.Vector;

public class Tutorials_30_Days_of_Code_Day_27_Testing {
	public static void main (String[] args){
		System.out.println ("5");
		Random random = new Random();
		boolean yes=true;
		for (int i=0;i<5;i++){
			StringBuilder sb = new StringBuilder();
			int n = random.nextInt(19) + i*19+3;
			int k = random.nextInt(n)+1;
			sb.append(n +" " + k);
			sb.append("\n");
			sb.append("-1 0 1 ");
			int count =0;
			for (int j=3;j<n;j++){
				int a = random.nextInt(2000)-1000;
				if (a>=0)
					count++;
				sb.append(a+ " ");
			}
			
			if ((yes && count>=k)||(!yes &&count<k)){
//					System.out.println("Oops");
					i--;
					continue;
			}
			yes=!yes;
			System.out.println(sb.toString());
		}
	}

}
