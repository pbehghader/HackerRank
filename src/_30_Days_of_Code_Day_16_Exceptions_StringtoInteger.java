import java.util.Scanner;

public class _30_Days_of_Code_Day_16_Exceptions_StringtoInteger {
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String S = in.next();
	        int i = 0; 
	        try{
	        i= Integer.parseInt(S);
	        System.out.println(i);
	        }catch(Exception e){
	        	System.out.println("Bad String");
	        }
	    }
}
