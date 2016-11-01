import java.util.HashMap;
import java.util.Scanner;

public class Algorithms_Bit_Manipulation_Manipulative_Numbers {
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int [] nums = new int [N];
		
		int max=0;
		for (int n=0;n<N;n++){
			nums[n]=sc.nextInt();
			if (max<nums[n])
				max=nums[n];
		}
		
		int p = 1;
		while (p*2<=max)
			p*=2;
		
		while (p>0){
			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			boolean found=true;
			for (int n=0;n<N;n++){
				int x = nums[n]/p;
				if (!map.containsKey(x))
					map.put(x, 1);
				else
					map.put(x, map.get(x)+1);
				if (map.get(x)>N/2){
					found=false;
					break ;
				}
			}
			if (found)
				break;
			p/=2;
		}
		if(p==0)
			System.out.println(-1);
		else{
			int k=0;
			while (p>1){
				p/=2;
				k++;
			}
			System.out.println(k);	
		}
			
		
	}

}
