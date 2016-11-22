import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Algorithms_Implementation_Almost_Sorted {
	public static void main (String[] args){
		int n ;
		Scanner sc = new Scanner (System.in);
		n = sc.nextInt();
		int [] arr = new int [n];
		List<Integer> v = new Vector<Integer> ();
		for (int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			v.add(arr[i]);
		}
		
		Collections.sort(v);
		
		int l = 0;
		int r = n-1;
		
		while (l<n){
			if (arr[l]==v.get(l))
				l++;
			else 
				break;
		}
		while (r>=0){
			if (arr[r]==v.get(r))
				r--;
			else
				break;
		}
		
		if (r<l)
			System.out.print("yes");
		
		boolean swap = true; 
		for (int i=l+1;i<r;i++)
			if (arr[i]!=v.get(i))
				swap = false;
		
		if (swap){
			System.out.println("yes");
			System.out.println("swap " + ++l + " " + ++r);
			return ;
		}
		
		boolean rev = true ;
		for (int i=l;i<=r;i++)
			if (arr[i]!=v.get(r-i+l))
				rev = false ;
		
		if (rev){
			System.out.println("yes");
			System.out.println("reverse "+ ++l+" " + ++r);
			return ;
		}
			
		System.out.println ("no");
	}
}
