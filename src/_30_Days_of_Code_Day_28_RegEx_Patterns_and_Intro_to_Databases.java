import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class _30_Days_of_Code_Day_28_RegEx_Patterns_and_Intro_to_Databases {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner (System.in);
	        int N = Integer.parseInt(sc.nextLine());
	        List<String> names = new Vector<String>();
	        for (int i=0; i<N; i++){
	            String line = sc.nextLine();
	            if (line.contains("@gmail.com"))
	            	names.add(line.substring(0, line.indexOf(" ")));
	        }
	        Collections.sort(names);
	        for (String name : names)
	        	System.out.println(name);
	    }
}
