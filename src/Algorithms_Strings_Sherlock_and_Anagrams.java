import java.util.Scanner;

public class Algorithms_Strings_Sherlock_and_Anagrams {
	
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t-->0){
			String orig = sc.nextLine();
			int total = 0;
			for (int l=1;l<orig.length();l++){
				for (int i=0;i+l<=orig.length();i++){
					String sub1=orig.substring(i,i+l);
					
					for (int j=i+1;j+l<=orig.length();j++){
						
						String sub2=orig.substring(j,j+l);
//						System.out.println(sub1+ " " + sub2);
						if (isAnagrams(sub1,sub2)){
							total ++;
//							System.out.println(i+" "+(i+l)+" "+j+" "+(j+l));
						}
					}
				}
			}
			System.out.println(total);
		}
	}

	private static boolean isAnagrams(String sub1, String sub2) {
		int[] count = new int [256];
		for (int i=0;i<sub1.length();i++){
			count[sub1.charAt(i)]++;
			count[sub2.charAt(i)]--;
		}
		for (int i='a';i<='z';i++){
			if (count[i]!=0)
				return false;
		}
			
		return true;
	}

}
