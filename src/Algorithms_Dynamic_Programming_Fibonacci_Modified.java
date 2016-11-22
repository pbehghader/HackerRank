import java.math.BigInteger;
import java.util.Scanner;

public class Algorithms_Dynamic_Programming_Fibonacci_Modified {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int t1 = sc.nextInt ();
        int t2 = sc.nextInt ();
        int n = sc.nextInt();
        BigInteger [] arr = new BigInteger[n];
        arr[0] = new BigInteger (Integer.toString(t1));
        arr[1] = new BigInteger (Integer.toString(t2));
        for (int i=2;i<n;i++){
            arr[i]=arr[i-1].multiply(arr[i-1]);
            arr[i]=arr[i].add(arr[i-2]);
        }
        System.out.println(arr[n-1]);
    }
}
